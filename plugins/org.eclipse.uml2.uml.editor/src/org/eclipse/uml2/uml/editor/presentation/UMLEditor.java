/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200, 215418, 156879, 227392, 226178, 232332, 247980
 *   Kenn Hussey - 286329, 323181
 *   Kenn Hussey (CEA) - 327039, 351774, 364419, 292633, 397324, 204658, 173565, 408612, 414970, 427833, 433216, 443017, 434958, 433768
 *   Christian W. Damus - 355218
 *   Christian W. Damus (CEA) - 286444
 *
 */
package org.eclipse.uml2.uml.editor.presentation;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.StrictCompoundCommand;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.CutToClipboardCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;

import org.eclipse.emf.edit.ui.provider.DecoratingColumLabelProvider;
//import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

//import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;

import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;

import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.DiagnosticDecorator;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;

import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;

import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;

import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.EContentAdapter;

import java.io.IOException;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.LinkedHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;

import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.swt.SWT;

import org.eclipse.swt.custom.CTabFolder;

import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;

import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;

import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import org.eclipse.ui.PartInitException;

import org.eclipse.ui.dialogs.SaveAsDialog;

import org.eclipse.ui.ide.IGotoMarker;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.common.edit.domain.UML2AdapterFactoryEditingDomain;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.edit.providers.ElementItemProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.eclipse.uml2.uml.edit.providers.UMLReflectiveItemProviderAdapterFactory;
import org.eclipse.uml2.uml.edit.providers.UMLResourceItemProviderAdapterFactory;

import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.uml2.uml.editor.UMLEditorPlugin;

import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;

/**
 * This is an example of a UML model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLEditor
		extends MultiPageEditorPart
		implements IEditingDomainProvider, ISelectionProvider, IMenuListener,
		IViewerProvider, IGotoMarker {

	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;

	/**
	 * This is the one adapter factory used for providing views of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * This is the content outline page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge...
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	/**
	 * This is the property sheet page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<PropertySheetPage> propertySheetPages = new ArrayList<PropertySheetPage>();

	/**
	 * This is the viewer that shadows the selection in the content outline.
	 * The parent relation must be correctly defined for this to work.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer selectionViewer;

	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Viewer currentViewer;

	/**
	 * This listens to which ever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	/**
	 * This keeps track of the selection of the editor as a whole.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers presented
	 * in Eclipse's Problems View.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();

	/**
	 * This listens for when the outline becomes active
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPartListener partListener = new IPartListener() {

		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				if (((ContentOutline) p).getCurrentPage() == contentOutlinePage) {
					getActionBarContributor().setActiveEditor(UMLEditor.this);

					setCurrentViewer(contentOutlineViewer);
				}
			} else if (p instanceof PropertySheet) {
				if (propertySheetPages.contains(((PropertySheet) p)
					.getCurrentPage())) {
					getActionBarContributor().setActiveEditor(UMLEditor.this);
					handleActivate();
				}
			} else if (p == UMLEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}

		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}

		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}

		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};

	/**
	 * Resources that have been removed since last activation.
	 * @generated
	 */
	protected Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation.
	 * @generated
	 */
	protected Collection<Resource> changedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been saved.
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded loaded.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EContentAdapter problemIndicationAdapter = new EContentAdapter() {

		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
					case Resource.RESOURCE__IS_LOADED :
					case Resource.RESOURCE__ERRORS :
					case Resource.RESOURCE__WARNINGS : {
						Resource resource = (Resource) notification
							.getNotifier();
						Diagnostic diagnostic = analyzeResourceProblems(
							resource, null);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							resourceToDiagnosticMap.put(resource, diagnostic);
						} else {
							resourceToDiagnosticMap.remove(resource);
						}

						if (updateProblemIndication) {
							getSite().getShell().getDisplay()
								.asyncExec(new Runnable() {

									public void run() {
										updateProblemIndication();
									}
								});
						}
						break;
					}
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		@Override
		protected void setTarget(Resource target) {
			basicSetTarget(target);
		}

		@Override
		protected void unsetTarget(Resource target) {
			basicUnsetTarget(target);
			resourceToDiagnosticMap.remove(target);
			if (updateProblemIndication) {
				getSite().getShell().getDisplay().asyncExec(new Runnable() {

					public void run() {
						updateProblemIndication();
					}
				});
			}
		}
	};

	/**
	 * This listens for workspace changes.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {

		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor
						implements IResourceDeltaVisitor {

					protected ResourceSet resourceSet = editingDomain
						.getResourceSet();

					protected Collection<Resource> changedResources = new ArrayList<Resource>();

					protected Collection<Resource> removedResources = new ArrayList<Resource>();

					public boolean visit(final IResourceDelta delta) {
						if (delta.getResource().getType() == IResource.FILE) {
							if (delta.getKind() == IResourceDelta.REMOVED
								|| delta.getKind() == IResourceDelta.CHANGED) {
								final Resource resource = resourceSet
									.getResource(URI.createPlatformResourceURI(
										delta.getFullPath().toString(), true),
										false);
								if (resource != null) {
									if (delta.getKind() == IResourceDelta.REMOVED) {
										removedResources.add(resource);
									} else {
										if ((delta.getFlags() & IResourceDelta.MARKERS) != 0) {
											DiagnosticDecorator.DiagnosticAdapter
												.update(resource, markerHelper
													.getMarkerDiagnostics(
														resource, (IFile) delta
															.getResource(),
														false));
										}
										if ((delta.getFlags() & IResourceDelta.CONTENT) != 0) {
											if (!savedResources
												.remove(resource)) {
												changedResources.add(resource);
											}
										}
									}
								}
							}
							return false;
						}

						return true;
					}

					public Collection<Resource> getChangedResources() {
						return changedResources;
					}

					public Collection<Resource> getRemovedResources() {
						return removedResources;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);

				if (!visitor.getRemovedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {

						public void run() {
							removedResources.addAll(visitor
								.getRemovedResources());
							if (!isDirty()) {
								getSite().getPage().closeEditor(UMLEditor.this,
									false);
							}
						}
					});
				}

				if (!visitor.getChangedResources().isEmpty()) {
					getSite().getShell().getDisplay().asyncExec(new Runnable() {

						public void run() {
							changedResources.addAll(visitor
								.getChangedResources());
							if (getSite().getPage().getActiveEditor() == UMLEditor.this) {
								handleActivate();
							}
						}
					});
				}
			} catch (CoreException exception) {
				UMLEditorPlugin.INSTANCE.log(exception);
			}
		}
	};

	/**
	 * A listener to set the most recent command's affected objects to be the
	 * selection of the viewer with focus.
	 */
	protected CommandStackListener commandStackListener = new CommandStackListener() {

		public void commandStackChanged(final EventObject event) {
			getContainer().getDisplay().asyncExec(new Runnable() {

				public void run() {
					firePropertyChange(IEditorPart.PROP_DIRTY);

					// Try to select the affected objects.
					//
					Command mostRecentCommand = ((CommandStack) event
						.getSource()).getMostRecentCommand();

					if (mostRecentCommand != null) {
						setSelectionToViewer(mostRecentCommand
							.getAffectedObjects());
					}

					for (Iterator<PropertySheetPage> i = propertySheetPages
						.iterator(); i.hasNext();) {

						PropertySheetPage propertySheetPage = i.next();

						if (propertySheetPage.getControl().isDisposed()) {
							i.remove();
						} else {
							propertySheetPage.refresh();
						}
					}
				}
			});
		}
	};

	// an adapter that reacts to load/unload of resources that may contain
	// stereotype applications to update the elements that they extend
	private Adapter stereotypeApplicationsResourceAdapter = new AdapterImpl() {

		private volatile Runnable pendingRefresh;

		@Override
		public void notifyChanged(Notification msg) {
			if (!msg.isTouch() && (getViewer() != null)
				&& !getViewer().getControl().isDisposed()) {
				if (msg.getNotifier() instanceof Resource) {
					if (msg.getFeatureID(Resource.class) == Resource.RESOURCE__IS_LOADED) {
						refreshViewer();
					}
				} else if (msg.getNotifier() instanceof ResourceSet) {
					if (msg.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
						switch (msg.getEventType()) {
							case Notification.ADD :
								handleResource((Resource) msg.getNewValue());
								break;
							case Notification.ADD_MANY :
								for (Object next : (Iterable<?>) msg
									.getNewValue()) {
									handleResource((Resource) next);
								}
								break;
							case Notification.SET :
								if (msg.getNewValue() != null) {
									handleResource((Resource) msg.getNewValue());
								}
								break;
						}
					}
				}
			}
		}

		private void handleResource(Resource resource) {
			if (!resource.eAdapters().contains(this)) {
				resource.eAdapters().add(this);
			}

			if (resource.isLoaded()) {
				// already loaded? Refresh now
				refreshViewer();
			}
		}

		private void refreshViewer() {
			if ((pendingRefresh == null) && (currentViewer != null)
				&& (currentViewer.getControl() != null)) {

				Runnable refreshRunnable = new Runnable() {

					public void run() {
						pendingRefresh = null;
						if (!currentViewer.getControl().isDisposed()) {
							currentViewer.refresh();
						}
					}
				};
				currentViewer.getControl().getDisplay()
					.asyncExec(refreshRunnable);
				pendingRefresh = refreshRunnable;
			}
		}

		@Override
		public void setTarget(Notifier newTarget) {
			super.setTarget(newTarget);

			if (newTarget instanceof ResourceSet) {
				// listen for resource unload/load
				for (Resource next : ((ResourceSet) newTarget).getResources()) {
					next.eAdapters().add(this);
				}
			}
		}

		@Override
		public void unsetTarget(Notifier oldTarget) {
			if (oldTarget instanceof ResourceSet) {
				for (Resource next : ((ResourceSet) oldTarget).getResources()) {
					next.eAdapters().remove(this);
				}
			}
		}
	};

	/**
	 * Handles activation of the editor or it's associated views.
	 * @generated
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
			editingDomain.getResourceToReadOnlyMap().clear();

			// Refresh any actions that may become enabled or disabled.
			//
			setSelection(getSelection());
		}

		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(UMLEditor.this, false);
			} else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		} else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	/**
	 * Handles what to do with changed resources on activation.
	 * @generated
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty()
			&& (!isDirty() || handleDirtyConflict())) {
			if (isDirty()) {
				changedResources.addAll(editingDomain.getResourceSet()
					.getResources());
			}
			editingDomain.getCommandStack().flush();

			updateProblemIndication = false;
			for (Resource resource : changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					} catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap.put(resource,
								analyzeResourceProblems(resource, exception));
						}
					}
				}
			}

			if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
				setSelection(StructuredSelection.EMPTY);
			}

			updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	/**
	 * Updates the problems indication with the information described in the specified diagnostic.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK,
				"org.eclipse.uml2.uml.editor", //$NON-NLS-1$
				0, null, new Object[]{editingDomain.getResourceSet()});
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0
				&& getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart) getEditor(lastEditorPage))
					.setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			} else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				problemEditorPart.setMarkerHelper(markerHelper);
				try {
					addPage(++lastEditorPage, problemEditorPart,
						getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				} catch (PartInitException exception) {
					UMLEditorPlugin.INSTANCE.log(exception);
				}
			}

			if (markerHelper.hasMarkers(editingDomain.getResourceSet())) {
				markerHelper.deleteMarkers(editingDomain.getResourceSet());
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					try {
						markerHelper.createMarkers(diagnostic);
					} catch (CoreException exception) {
						UMLEditorPlugin.INSTANCE.log(exception);
					}
				}
			}
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 * @generated
	 */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(),
			getString("_UI_FileConflict_label"), //$NON-NLS-1$
			getString("_WARN_FileConflict")); //$NON-NLS-1$
	}

	/**
	 * This creates a model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLEditor() {
		super();
		initializeEditingDomain();
	}

	/**
	 * This sets up the editing domain for the model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
			.addAdapterFactory(new UMLResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UMLItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory
			.addAdapterFactory(new UMLReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack() {

			@Override
			protected void handleError(Exception exception) {
				super.handleError(exception);

				BasicDiagnostic diagnostic = new BasicDiagnostic(
					UMLEditorPlugin.INSTANCE.getSymbolicName(), 0,
					exception.getLocalizedMessage(), null);
				diagnostic.add(BasicDiagnostic.toDiagnostic(exception));

				DiagnosticDialog.openProblem(getSite().getShell(), null,
					CommonPlugin.INSTANCE
						.getString("_UI_IgnoreException_exception"), //$NON-NLS-1$
					diagnostic);
			}
		};

		if (commandStackListener != null) {
			commandStack.addCommandStackListener(commandStackListener);
		}

		// Create a specialized editing domain with the command stack.
		//
		editingDomain = new UML2AdapterFactoryEditingDomain(adapterFactory,
			commandStack, new HashMap<Resource, Boolean>()) {

			@Override
			public Command createCommand(Class<? extends Command> commandClass,
					CommandParameter commandParameter) {

				if (commandClass == CopyToClipboardCommand.class) {
					return new UMLCopyToClipboardCommand(this,
						commandParameter.getCollection());
				} else if (commandClass == CutToClipboardCommand.class) {
					return new UMLCutToClipboardCommand(this,
						RemoveCommand.create(this, commandParameter.getOwner(),
							commandParameter.getFeature(),
							commandParameter.getCollection()));
				} else if (commandClass == PasteFromClipboardCommand.class) {
					return new UMLPasteFromClipboardCommand(this,
						commandParameter.getOwner(),
						commandParameter.getFeature(),
						commandParameter.getIndex(), getOptimizeCopy());
				} else {
					return super.createCommand(commandClass, commandParameter);
				}
			}

		};
	}

	/**
	 * This is here for the listener to be able to call it.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {

				public void run() {
					// Try to select the items in the current content viewer of the editor.
					//
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(
							theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider
			extends AdapterFactoryContentProvider {

		public ReverseAdapterFactoryContentProvider(
				AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null
				? Collections.EMPTY_SET
				: Collections.singleton(parent)).toArray();
		}

		@Override
		public Object[] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null
				? Collections.EMPTY_SET
				: Collections.singleton(parent)).toArray();
		}

		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	/**
	 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus,
	 * is the current one.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				// Create the listener on demand.
				//
				selectionChangedListener = new ISelectionChangedListener() {

					// This just notifies those things that are affected by the section.
					//
					public void selectionChanged(
							SelectionChangedEvent selectionChangedEvent) {
						setSelection(selectionChangedEvent.getSelection());
					}
				};
			}

			// Stop listening to the old one.
			//
			if (currentViewer != null) {
				currentViewer
					.removeSelectionChangedListener(selectionChangedListener);
			}

			// Start listening to the new one.
			//
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}

			// Remember it.
			//
			currentViewer = viewer;

			// Set the editors selection based on the current viewer's selection.
			//
			setSelection(currentViewer == null
				? StructuredSelection.EMPTY
				: currentViewer.getSelection());
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new Separator("additions")); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu,
			new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[]{LocalTransfer.getInstance(),
			LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance()};
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(
			viewer));
		viewer.addDropSupport(dndOperations, transfers,
			new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	/**
	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createModelGen() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput(), editingDomain
			.getResourceSet().getURIConverter());
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI,
				true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI,
				false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource,
				analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters()
			.add(problemIndicationAdapter);
	}

	public void createModel() {
		ResourceSet resourceSet = UMLUtil.init(editingDomain.getResourceSet());

		createModelGen();

		boolean saveNeeded = false;
		Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
		Map<Resource, URI> resourceToURIMap = new HashMap<Resource, URI>();
		EList<Resource> resources = resourceSet.getResources();

		for (int i = 0; i < resources.size(); i++) {
			Resource resource = resources.get(i);
			URI uri = resource.getURI();

			if (uriMap.containsKey(uri)) {
				uri = uriMap.get(uri);
			} else if (UML22UMLResource.FILE_EXTENSION.equals(uri
				.fileExtension())) {

				uri = uri.trimFileExtension().appendFileExtension(
					UMLResource.FILE_EXTENSION);

				if (i == 0) {
					setInputWithNotify(new URIEditorInput(uri));
					setPartName(uri.lastSegment());

					saveNeeded = true;
				}

				EcoreUtil.resolveAll(resource);
			}

			resourceToURIMap.put(resource, uri);
		}

		for (Map.Entry<Resource, URI> entry : resourceToURIMap.entrySet()) {
			entry.getKey().setURI(entry.getValue());
		}

		if (saveNeeded) {
			IProgressMonitor progressMonitor = getActionBars()
				.getStatusLineManager() != null
				? getActionBars().getStatusLineManager().getProgressMonitor()
				: new NullProgressMonitor();
			doSave(progressMonitor);
		}

		// listen for loading of new resources, to refresh in case they bring in
		// new stereotype applications (and unloading to remove them)
		resourceSet.eAdapters().add(stereotypeApplicationsResourceAdapter);
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the resource
	 * and the specified exception (if any).
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource,
			Exception exception) {
		boolean hasErrors = !resource.getErrors().isEmpty();
		if (hasErrors || !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(hasErrors
				? Diagnostic.ERROR
				: Diagnostic.WARNING,
				"org.eclipse.uml2.uml.editor", //$NON-NLS-1$
				0,
				getString("_UI_CreateModelError_message", resource.getURI()), //$NON-NLS-1$
				new Object[]{exception == null
					? (Object) resource
					: exception});
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(
				Diagnostic.ERROR,
				"org.eclipse.uml2.uml.editor", //$NON-NLS-1$
				0,
				getString("_UI_CreateModelError_message", resource.getURI()), //$NON-NLS-1$
				new Object[]{exception});
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			// Create a page for the selection tree view.
			//
			Tree tree = new Tree(getContainer(), SWT.MULTI);
			selectionViewer = new TreeViewer(tree);
			setCurrentViewer(selectionViewer);

			selectionViewer
				.setContentProvider(new AdapterFactoryContentProvider(
					adapterFactory));
			selectionViewer.setLabelProvider(new DecoratingColumLabelProvider(
				new AdapterFactoryLabelProvider.FontAndColorProvider(
					adapterFactory, selectionViewer), new DiagnosticDecorator(
					editingDomain.getResourceSet(), selectionViewer)));
			selectionViewer.setInput(editingDomain.getResourceSet());
			selectionViewer.setSelection(new StructuredSelection(editingDomain
				.getResourceSet().getResources().get(0)), true);

			new AdapterFactoryTreeEditor(selectionViewer.getTree(),
				adapterFactory);
			new ColumnViewerInformationControlToolTipSupport(selectionViewer,
				new DiagnosticDecorator.EditingDomainLocationListener(
					editingDomain, selectionViewer));

			createContextMenuFor(selectionViewer);
			int pageIndex = addPage(tree);
			setPageText(pageIndex, getString("_UI_SelectionPage_label")); //$NON-NLS-1$

			getSite().getShell().getDisplay().asyncExec(new Runnable() {

				public void run() {
					setActivePage(0);
				}
			});
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {

			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		getSite().getShell().getDisplay().asyncExec(new Runnable() {

			public void run() {
				updateProblemIndication();
			}
		});
	}

	/**
	 * If there is just one page in the multi-page editor part,
	 * this hides the single tab at the bottom.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, ""); //$NON-NLS-1$
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part,
	 * this shows the tabs at the bottom.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label")); //$NON-NLS-1$
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);

		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView()
				? getContentOutlinePage()
				: null;
		} else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else if (key.equals(IGotoMarker.class)) {
			return this;
		} else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage
					extends ContentOutlinePage {

				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer
						.setContentProvider(new AdapterFactoryContentProvider(
							adapterFactory));
					contentOutlineViewer
						.setLabelProvider(new DecoratingColumLabelProvider(
							new AdapterFactoryLabelProvider.FontAndColorProvider(
								adapterFactory, contentOutlineViewer),
							new DiagnosticDecorator(editingDomain
								.getResourceSet(), contentOutlineViewer)));
					contentOutlineViewer.setInput(editingDomain
						.getResourceSet());

					new ColumnViewerInformationControlToolTipSupport(
						contentOutlineViewer,
						new DiagnosticDecorator.EditingDomainLocationListener(
							editingDomain, contentOutlineViewer));

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources()
						.isEmpty()) {
						// Select the root object in the view.
						//
						contentOutlineViewer.setSelection(
							new StructuredSelection(editingDomain
								.getResourceSet().getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager,
						IToolBarManager toolBarManager,
						IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager,
						statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this,
						actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage
				.addSelectionChangedListener(new ISelectionChangedListener() {

					// This ensures that we handle selections correctly.
					//
					public void selectionChanged(SelectionChangedEvent event) {
						handleContentOutlineSelection(event.getSelection());
					}
				});
		}

		return contentOutlinePage;
	}

	/**
	 * This accesses a cached version of the property sheet.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPageGen() {
		PropertySheetPage propertySheetPage = new ExtendedPropertySheetPage(
			editingDomain, ExtendedPropertySheetPage.Decoration.MANUAL) {

			@Override
			public void setSelectionToViewer(List<?> selection) {
				UMLEditor.this.setSelectionToViewer(selection);
				UMLEditor.this.setFocus();
			}

			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		};
		propertySheetPage
			.setPropertySourceProvider(new AdapterFactoryContentProvider(
				adapterFactory));
		propertySheetPages.add(propertySheetPage);

		return propertySheetPage;
	}

	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new ExtendedPropertySheetPage(
			editingDomain) {

			@Override
			public void setSelectionToViewer(List<?> selection) {
				UMLEditor.this.setSelectionToViewer(selection);
				UMLEditor.this.setFocus();
			}

			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		};

		propertySheetPage
			.setPropertySourceProvider(new UMLAdapterFactoryContentProvider(
				adapterFactory));
		propertySheetPages.add(propertySheetPage);

		return propertySheetPage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (selectionViewer != null && !selection.isEmpty()
			&& selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection)
				.iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();

				ArrayList<Object> selectionList = new ArrayList<Object>();
				selectionList.add(selectedElement);
				while (selectedElements.hasNext()) {
					selectionList.add(selectedElements.next());
				}

				// Set the selection to the widget.
				//
				selectionViewer.setSelection(new StructuredSelection(
					selectionList));
			}
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack) editingDomain.getCommandStack())
			.isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
			Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER,
			Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			// This is the method that gets invoked when the operation runs.
			//
			@Override
			public void execute(IProgressMonitor monitor) {
				// Save the resources to the file system.
				//
				boolean first = true;
				EList<Resource> resources = editingDomain.getResourceSet()
					.getResources();

				for (int i = 0; i < resources.size(); i++) {
					Resource resource = resources.get(i);

					if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
						&& !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {
							resourceToDiagnosticMap.put(resource,
								analyzeResourceProblems(resource, exception));
						}
						first = false;
					}
				}
			}
		};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false,
				operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			UMLEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * This returns whether something has been persisted to the URI of the specified resource.
	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet()
				.getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	protected void copyResource(ResourceSet resourceSet, Resource resource,
			URI uri) {
		String fileExtension = uri.fileExtension();

		Resource newResource = resourceSet.createResource(uri,
			XMI2UMLResource.FILE_EXTENSION.equals(fileExtension)
				? XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER
				: (CMOF2UMLResource.FILE_EXTENSION.equals(fileExtension)
					? CMOF2UMLResource.CMOF_CONTENT_TYPE_IDENTIFIER
					: null));
		EList<EObject> newContents = newResource.getContents();

		EcoreUtil.resolveAll(resource);

		Map<Element, List<EObject>> allExternalStereotypeApplications = new HashMap<Element, List<EObject>>();

		for (TreeIterator<EObject> allProperContents = EcoreUtil
			.getAllProperContents(resource, true); allProperContents.hasNext();) {

			EObject properContent = allProperContents.next();

			if (properContent instanceof Element) {
				Element element = (Element) properContent;
				EList<EObject> stereotypeApplications = element
					.getStereotypeApplications();

				if (stereotypeApplications.size() > 0) {
					List<EObject> externalStereotypeApplications = new ArrayList<EObject>();

					for (EObject stereotypeApplication : stereotypeApplications) {

						if (stereotypeApplication.eResource() != resource
							&& StereotypeApplicationHelper.getInstance(null)
								.removeFromContainmentList(element,
									stereotypeApplication)) {

							externalStereotypeApplications
								.add(stereotypeApplication);
						}
					}

					if (externalStereotypeApplications.size() > 0) {
						allExternalStereotypeApplications.put(element,
							externalStereotypeApplications);
					}
				}
			}
		}

		for (Iterator<EObject> contents = resource.getContents().iterator(); contents
			.hasNext();) {

			EObject eObject = contents.next();
			contents.remove();
			newContents.add(eObject);
		}

		for (Element element : allExternalStereotypeApplications.keySet()) {

			for (EObject stereotypeApplication : allExternalStereotypeApplications
				.get(element)) {

				StereotypeApplicationHelper.getInstance(null)
					.addToContainmentList(element, stereotypeApplication);
			}
		}

		EList<Resource> resources = resourceSet.getResources();
		int index = resources.indexOf(resource);

		resources.remove(index);
		resources.move(index, newResource);
	}

	/**
	 * This also changes the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();

		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

			if (file != null) {
				URI newURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);

				ResourceSet resourceSet = editingDomain.getResourceSet();
				EList<Resource> resources = resourceSet.getResources();

				Resource resource = resources.get(0);
				URI uri = resource.getURI();

				String fileExtension = uri.fileExtension();
				String newFileExtension = newURI.fileExtension();

				if (!UML2Util.safeEquals(fileExtension, newFileExtension)) {
					copyResource(resourceSet, resource, newURI);

					if (MessageDialog
						.openQuestion(
							getSite().getShell(),
							getTitle(),
							UMLEditorPlugin.INSTANCE
								.getString(
									"_UI_Save_All_Resources_As", new Object[]{fileExtension, newFileExtension}))) { //$NON-NLS-1$

						for (int i = 1; i < resources.size(); i++) {
							resource = resources.get(i);
							uri = resource.getURI();

							if (UML2Util.safeEquals(uri.fileExtension(),
								fileExtension)
								&& (!resource.getContents().isEmpty() || isPersisted(resource))
								&& !editingDomain.isReadOnly(resource)) {

								copyResource(resourceSet, resource,
									uri.trimFileExtension()
										.appendFileExtension(newFileExtension));
							}
						}
					}
				}

				doSaveAs(newURI, new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = getActionBars()
			.getStatusLineManager() != null
			? getActionBars().getStatusLineManager().getProgressMonitor()
			: new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void gotoMarker(IMarker marker) {
		try {
			if (marker.isSubtypeOf((EValidator.MARKER))) {
				String uriAttribute = marker.getAttribute(
					EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = editingDomain.getResourceSet()
						.getEObject(uri, true);
					if (eObject != null) {
						setSelectionToViewer(Collections
							.singleton(editingDomain.getWrapper(eObject)));
					}
				}
			}
		} catch (CoreException exception) {
			UMLEditorPlugin.INSTANCE.log(exception);
		}
	}

	/**
	 * This is called during startup.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
			resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFocus() {
		getControl(getActivePage()).setFocus();
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection getSelection() {
		return editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
	 * Calling this result will notify the listeners.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(ISelection selection) {
		editorSelection = selection;

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener
				.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null
			&& currentViewer == contentOutlineViewer
			? contentOutlineStatusLineManager
			: getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection) selection)
					.toList();
				switch (collection.size()) {
					case 0 : {
						statusLineManager
							.setMessage(getString("_UI_NoObjectSelected")); //$NON-NLS-1$
						break;
					}
					case 1 : {
						String text = new AdapterFactoryItemDelegator(
							adapterFactory).getText(collection.iterator()
							.next());
						statusLineManager.setMessage(getString(
							"_UI_SingleObjectSelected", text)); //$NON-NLS-1$
						break;
					}
					default : {
						statusLineManager
							.setMessage(getString(
								"_UI_MultiObjectSelected", Integer.toString(collection.size()))); //$NON-NLS-1$
						break;
					}
				}
			} else {
				statusLineManager.setMessage(""); //$NON-NLS-1$
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key) {
		return UMLEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return UMLEditorPlugin.INSTANCE.getString(key, new Object[]{s1});
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor())
			.menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite()
			.getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disposeGen() {
		updateProblemIndication = false;

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(
			resourceChangeListener);

		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		for (PropertySheetPage propertySheetPage : propertySheetPages) {
			propertySheetPage.dispose();
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	@Override
	public void dispose() {

		if (stereotypeApplicationsResourceAdapter != null
			&& editingDomain != null) {

			editingDomain.getResourceSet().eAdapters()
				.remove(stereotypeApplicationsResourceAdapter);
		}

		if (commandStackListener != null && editingDomain != null) {
			editingDomain.getCommandStack().removeCommandStackListener(
				commandStackListener);
		}

		disposeGen();

		for (Resource resource : editingDomain.getResourceSet().getResources()) {
			resource.unload();
		}
	}

	/**
	 * Returns whether the outline view should be presented to the user.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean showOutlineView() {
		return false;
	}

	protected static class UMLAdapterFactoryContentProvider
			extends AdapterFactoryContentProvider {

		protected UMLAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		protected IPropertySource createPropertySource(Object object,
				IItemPropertySource itemPropertySource) {
			return new UMLPropertySource(object, itemPropertySource);
		}
	}

	protected static class UMLPropertySource
			extends PropertySource {

		protected List<IItemPropertyDescriptor> stereotypeApplicationItemPropertyDescriptors = null;

		protected UMLPropertySource(Object object,
				IItemPropertySource itemPropertySource) {
			super(object, itemPropertySource);
		}

		@Override
		protected IPropertyDescriptor createPropertyDescriptor(
				IItemPropertyDescriptor itemPropertyDescriptor) {
			return new UMLPropertyDescriptor(object, itemPropertyDescriptor);
		}

		@Override
		public IPropertyDescriptor[] getPropertyDescriptors() {
			List<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>();

			List<IItemPropertyDescriptor> itemPropertyDescriptors = itemPropertySource
				.getPropertyDescriptors(object);

			if (itemPropertyDescriptors != null) {

				for (IItemPropertyDescriptor itemPropertyDescriptor : itemPropertyDescriptors) {
					propertyDescriptors
						.add(createPropertyDescriptor(itemPropertyDescriptor));
				}
			}

			if (itemPropertySource instanceof ElementItemProvider) {
				ElementItemProvider elementItemProvider = (ElementItemProvider) itemPropertySource;
				stereotypeApplicationItemPropertyDescriptors = elementItemProvider
					.getStereotypeApplicationPropertyDescriptors(object);

				if (stereotypeApplicationItemPropertyDescriptors != null) {

					for (IItemPropertyDescriptor itemPropertyDescriptor : stereotypeApplicationItemPropertyDescriptors) {
						propertyDescriptors
							.add(createPropertyDescriptor(itemPropertyDescriptor));
					}
				}
			}

			return propertyDescriptors
				.toArray(new IPropertyDescriptor[propertyDescriptors.size()]);
		}

		protected IItemPropertyDescriptor getItemPropertyDescriptor(
				Object propertyId) {
			IItemPropertyDescriptor itemPropertyDescriptor = itemPropertySource
				.getPropertyDescriptor(object, propertyId);

			return itemPropertyDescriptor == null
				&& itemPropertySource instanceof ElementItemProvider
				? ((ElementItemProvider) itemPropertySource)
					.getStereotypeApplicationPropertyDescriptor(object,
						propertyId)
				: itemPropertyDescriptor;
		}

		@Override
		public Object getPropertyValue(Object propertyId) {
			return getItemPropertyDescriptor(propertyId).getPropertyValue(
				object);
		}

		@Override
		public boolean isPropertySet(Object propertyId) {
			return getItemPropertyDescriptor(propertyId).isPropertySet(object);
		}

		@Override
		public void resetPropertyValue(Object propertyId) {
			getItemPropertyDescriptor(propertyId).resetPropertyValue(object);
		}

		@Override
		public void setPropertyValue(Object propertyId, Object value) {
			getItemPropertyDescriptor(propertyId).setPropertyValue(object,
				value);
		}

		@Override
		public boolean isPropertyResettable(Object propertyId) {
			IItemPropertyDescriptor propertyDescriptor = getItemPropertyDescriptor(propertyId);
			return propertyDescriptor.canSetProperty(object)
				&& propertyDescriptor.isPropertySet(object);
		}

	}

	protected static class UMLPropertyDescriptor
			extends PropertyDescriptor {

		protected UMLPropertyDescriptor(Object object,
				IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		@Override
		protected ILabelProvider getEditLabelProvider() {
			final IItemLabelProvider itemLabelProvider = itemPropertyDescriptor
				.getLabelProvider(object);

			return new LabelProvider() {

				@Override
				public String getText(Object object) {
					String text = itemLabelProvider instanceof IItemQualifiedTextProvider
						? ((IItemQualifiedTextProvider) itemLabelProvider)
							.getQualifiedText(object)
						: itemLabelProvider.getText(object);

					if (object instanceof EObject) {
						Resource eResource = ((EObject) object).eResource();

						if (eResource != null) {
							String lastSegment = eResource.getURI()
								.lastSegment();

							if (lastSegment != null) {
								text += " - " + lastSegment; //$NON-NLS-1$
							}
						}
					}

					return text;
				}

				@Override
				public Image getImage(Object object) {
					return ExtendedImageRegistry.getInstance().getImage(
						itemLabelProvider.getImage(object));
				}
			};
		}
	}

	@SuppressWarnings("unchecked")
	protected static <O> List<O> collectAllStereotypeApplications(
			EObject eObject, List<O> allStereotypeApplications) {

		if (eObject instanceof Element) {

			for (EObject stereotypeApplication : ((Element) eObject)
				.getStereotypeApplications()) {

				allStereotypeApplications.add((O) stereotypeApplication);

				collectAllStereotypeApplications(stereotypeApplication,
					allStereotypeApplications);
			}
		}

		for (TreeIterator<EObject> allContents = EcoreUtil.getAllContents(
			eObject, true); allContents.hasNext();) {

			EObject content = allContents.next();

			if (content instanceof Element) {

				for (EObject stereotypeApplication : ((Element) content)
					.getStereotypeApplications()) {

					allStereotypeApplications.add((O) stereotypeApplication);

					collectAllStereotypeApplications(stereotypeApplication,
						allStereotypeApplications);
				}
			}
		}

		return allStereotypeApplications;
	}

	protected static class UMLCopyToClipboardCommand
			extends CopyToClipboardCommand {

		protected UMLCopyToClipboardCommand(EditingDomain domain,
				Collection<?> collection) {
			super(domain, collection);
		}

		@Override
		protected boolean prepare() {
			List<Object> objectsToCopy = new ArrayList<Object>();

			for (Object sourceObject : sourceObjects) {
				objectsToCopy.add(sourceObject);

				if (sourceObject instanceof EObject) {
					collectAllStereotypeApplications((EObject) sourceObject,
						objectsToCopy);
				}
			}

			sourceObjects = objectsToCopy;

			return super.prepare();
		}
	}

	protected static class UMLCutToClipboardCommand
			extends CutToClipboardCommand {

		protected UMLCutToClipboardCommand(EditingDomain domain, Command command) {
			super(domain, command);
		}

		@Override
		protected boolean prepare() {
			CompoundCommand compoundCommand = new CompoundCommand();

			if (command instanceof RemoveCommand) {
				RemoveCommand removeCommand = (RemoveCommand) command;

				for (Object object : removeCommand.getCollection()) {

					if (object instanceof EObject) {
						final List<EObject> allStereotypeApplications = collectAllStereotypeApplications(
							(EObject) object, new ArrayList<EObject>());

						compoundCommand.append(new ChangeCommand(domain,
							new Runnable() {

								public void run() {

									for (EObject stereotypeApplication : allStereotypeApplications) {
										UMLUtil.StereotypeApplicationHelper
											.getInstance(null)
											.removeFromContainmentList(
												UMLUtil
													.getBaseElement(stereotypeApplication),
												stereotypeApplication);
									}
								}
							}));

						compoundCommand.append(new IdentityCommand(
							allStereotypeApplications));
					}
				}
			}

			compoundCommand.append(command);

			command = compoundCommand;

			return super.prepare();
		}

	}

	protected static class UMLPasteFromClipboardCommand
			extends PasteFromClipboardCommand {

		private static class PrivateUMLUtil
				extends UMLUtil {

			private static Stereotype getStereotype(
					EObject stereotypeApplication, Object context) {
				return UMLUtil.getStereotype(stereotypeApplication.eClass(),
					context instanceof EObject
						? (EObject) context
						: null);
			}

			private static Element getBaseElement(
					EObject stereotypeApplication, Object context) {
				return getStereotype(stereotypeApplication, context) != null
					? getBaseElement(stereotypeApplication.eClass(),
						stereotypeApplication)
					: null;
			}
		}

		protected UMLPasteFromClipboardCommand(EditingDomain domain,
				Object owner, Object feature, int index, boolean optimize) {
			super(domain, owner, feature, index, optimize);
		}

		protected ENamedElement getAppliedDefinition(
				org.eclipse.uml2.uml.Package nearestPackage,
				Stereotype stereotype) {
			ProfileApplication profileApplication = nearestPackage == null
				? null
				: nearestPackage.getProfileApplication(stereotype.getProfile(),
					true);

			return profileApplication == null
				? null
				: profileApplication.getAppliedDefinition(stereotype);
		}

		@Override
		protected boolean prepare() {
			command = new StrictCompoundCommand();

			final Command copyCommand = CopyCommand.create(domain,
				domain.getClipboard());
			command.append(copyCommand);

			command.append(new CommandWrapper() {

				protected Collection<Object> original;

				protected Collection<Object> copy;

				@Override
				protected Command createCommand() {
					original = domain.getClipboard();
					copy = new ArrayList<Object>(copyCommand.getResult());

					if (original.size() == copy.size()) {

						for (Iterator<Object> i = original.iterator(), j = copy
							.iterator(); i.hasNext();) {

							Object originalObject = i.next();
							Object copyObject = j.next();

							if (originalObject.getClass() != copyObject
								.getClass()) {

								original = null;
								break;
							}
						}
					}

					CompoundCommand compoundCommand = new CompoundCommand();

					List<Object> objectsToAdd = new ArrayList<Object>();
					final List<EObject> stereotypeApplicationsToAdd = new ArrayList<EObject>();

					org.eclipse.uml2.uml.Package ownerNearestPackage = owner instanceof Element
						? ((Element) owner).getNearestPackage()
						: UMLFactory.eINSTANCE.createPackage();

					for (Object object : original == null
						? copy
						: original) {

						if (object instanceof EObject) {
							EObject stereotypeApplication = (EObject) object;
							Stereotype stereotype = PrivateUMLUtil
								.getStereotype(stereotypeApplication, owner);

							if (stereotype != null) {
								Element baseElement = PrivateUMLUtil
									.getBaseElement(stereotypeApplication,
										owner);

								if (baseElement != null) {
									EClass definition = stereotypeApplication
										.eClass();

									if (getAppliedDefinition(
										baseElement.getNearestPackage(),
										stereotype) == definition
										|| getAppliedDefinition(
											ownerNearestPackage, stereotype) == definition) {

										stereotypeApplicationsToAdd
											.add(stereotypeApplication);
									}
								}

								continue;
							}
						}

						objectsToAdd.add(object);
					}

					compoundCommand.append(AddCommand.create(domain, owner,
						feature, objectsToAdd, index));

					if (stereotypeApplicationsToAdd.size() > 0) {
						compoundCommand.append(new CommandWrapper() {

							@Override
							protected Command createCommand() {
								return new ChangeCommand(domain,
									new Runnable() {

										public void run() {

											for (EObject stereotypeApplication : stereotypeApplicationsToAdd) {
												UMLUtil.StereotypeApplicationHelper
													.getInstance(null)
													.addToContainmentList(
														PrivateUMLUtil
															.getBaseElement(
																stereotypeApplication,
																owner),
														stereotypeApplication);
											}
										}
									});
							}
						});
					}

					return compoundCommand;
				}

				@Override
				public void execute() {

					if (original != null) {
						domain.setClipboard(copy);
					}

					super.execute();
				}

				@Override
				public void undo() {
					super.undo();

					if (original != null) {
						domain.setClipboard(original);
					}
				}

				@Override
				public void redo() {

					if (original != null) {
						domain.setClipboard(copy);
					}

					super.redo();
				}
			});

			boolean result;

			if (optimize) {
				result = optimizedCanExecute();
			} else {
				result = command.canExecute();
			}

			return result;
		}

		@Override
		protected boolean optimizedCanExecute() {
			List<Object> objectsToAdd = null;
			Collection<Object> clipboard = domain.getClipboard();

			if (clipboard != null) {
				objectsToAdd = new ArrayList<Object>();

				for (Object object : clipboard) {

					if (object instanceof EObject
						&& PrivateUMLUtil
							.getStereotype((EObject) object, owner) != null) {

						continue;
					}

					objectsToAdd.add(object);
				}
			}

			Command addCommand = AddCommand.create(domain, owner, feature,
				objectsToAdd);
			boolean result = addCommand.canExecute();
			addCommand.dispose();
			return result;
		}

	}

}