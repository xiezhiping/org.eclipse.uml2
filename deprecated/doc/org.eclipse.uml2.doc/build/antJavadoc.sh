# The current direcotry
currentPath=$PWD

# The eclipse directory
eclipseDir=$1

# The destination directory
destDir=$eclipseDir/plugins/org.eclipse.uml2.doc/references/javadoc

# Don't execute if the destination directory has files
if [ -d $destDir ]; then
	exit
fi

function groupPackage
{
	plugin=$1
	hasToken=`grep "@$plugin@" $currentPath/javadoc.xml.template`
	if [ "x$hasToken" != "x"  ]; then
		srcDir=$eclipseDir/plugins/$plugin/src
		if [ -d $srcDir ]; then
			packages=`find $srcDir -type f -name '*.java' -exec grep -e '^package .*;' {} \; | sed -e 's/^package *\(.*\);/\1/' | sort | uniq | xargs | sed -e 's/ /:/g'`
			packages=`echo $packages | sed -e 's/\//\\\\\\//g' | sed -e 's/\./\\\\\./g'`
		
			sed -e "s/\@${plugin}\@/${packages}/g" $currentPath/javadoc.xml.template > javadoc.xml.template.tmp
	
			mv javadoc.xml.template.tmp javadoc.xml.template
		fi
	fi
}
groupPackage org.eclipse.uml2
groupPackage org.eclipse.uml2.edit
groupPackage org.eclipse.uml2.editor

# The directory of the sdo plugins in the order they were built 
pluginDirs=`find $eclipseDir/plugins -name *.jar -printf '%T@ %p\n' | sort -n | egrep -e 'org.eclipse.uml2' | egrep -v 'example' | egrep -v 'tests' | cut -f2 -d' ' | sed -e 's/\(\/.*\)\/.*/\1/'`

# All the jars in the pluigins directory
classpath=`find $eclipseDir/plugins -name *.jar -print | grep -v org.eclipse.uml2 | tr '\n' ';'`

# Calculates the packagesets
packagesets=""
for pluginDir in $pluginDirs; do
	pluginDir=`echo $pluginDir | sed -e 's/\/runtime$//g'`
	srcDir=$pluginDir/src
	if [ -d $srcDir ]; then
        packagesets=$packagesets"<packageset dir=\"$srcDir\">"
        packagesets=$packagesets"<exclude name=\"**/impl/**\"/>"
        packagesets=$packagesets"<exclude name=\"**/internal/**\"/>"
        packagesets=$packagesets"</packageset>"
	fi
done

# Replaces the token @packagesets@ in the template by the actual value
packagesets=`echo $packagesets | sed -e 's/\//\\\\\\//g' | sed -e 's/\./\\\\\./g'`
sed -e "s/\@packagesets\@/${packagesets}/g" $currentPath/javadoc.xml.template > javadoc.xml

# Executes the ant script
ant	-f javadoc.xml \
	-DdestDir="$destDir" \
	-Dclasspath="$classpath" \
	-DeclipseDir="$eclipseDir" \
	-Doverview="$eclipseDir/plugins/org.eclipse.uml2.doc/build/overview.html"