/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.bug.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.tests.util.StandaloneSupport;

/**
 * Tests concurrent access to the {@link CacheAdapter} from multiple threads.
 */
public class Bug332057Test
		extends TestCase {

	private static final boolean DEBUG = false;

	private static final int TIMEOUT = 5;

	private static final int THREADS = 19;

	private static final int ITERATIONS = 5;

	private static final int SAMPLES = 10;

	private ThreadGroup group;

	private CountDownLatch latch;

	private final Collection<Throwable> exceptions = Collections
		.synchronizedCollection(new ArrayList<Throwable>());

	public Bug332057Test() {
		super();
	}

	public Bug332057Test(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Bug332057Test.class, "Bug 332057 tests"); //$NON-NLS-1$
	}

	//
	// Tests
	//

	public void testConcurrentCacheAdapterAccess() {
		doTestConcurrentCacheAdapterAccess(THREADS, ITERATIONS);
	}

	// rename to run statistics on multiple concurrent thread performance
	public void _testMultiThreadPerformance() {
		doStatistics(THREADS, ITERATIONS);
	}

	// rename to run statistics on single thread performance
	public void _testSingleThreadPerformance() {
		// this single thread does as much work as the parallel case
		doStatistics(1, THREADS * ITERATIONS);
	}

	void doTestConcurrentCacheAdapterAccess(final int numThreads,
			final int iterations) {

		latch = new CountDownLatch(numThreads);

		for (int i = 1; i <= numThreads; i++) {
			createThread(i, iterations);
		}

		try {
			assertTrue("Deadlock occurred",
				latch.await(TIMEOUT, TimeUnit.MINUTES));
			assertTrue("Some thread failed with an exception.",
				exceptions.isEmpty());
		} catch (InterruptedException e) {
			fail("Test interrupted");
		}
	}

	void doStatistics(final int numThreads, final int iterations) {
		final StatsCounter stats = new StatsCounter();

		for (int i = 0; i <= SAMPLES; i++) { // 1 extra to warm up
			stats.start();

			try {
				doTestConcurrentCacheAdapterAccess(numThreads, iterations);
			} finally {
				long elapsed = stats.sample();
				System.out.printf("Finished in %d.%03d seconds.%n",
					elapsed / 1000L, elapsed % 1000L);
				System.out.flush();
			}
		}

		System.out.printf("Mean: %.2f seconds (std dev: %.2f seconds).%n",
			stats.mean(), stats.stddev());
		System.out.flush();
	}

	//
	// Test framework
	//

	@Override
	protected void setUp()
			throws Exception {

		group = new ThreadGroup("CacheAdapterTest");
		group.setDaemon(true);
	}

	private Thread createThread(int index, final int iterations) {
		Thread result = new Thread(group, new Runnable() {

			public void run() {
				try {
					threadLoop(iterations);
				} catch (Exception e) {
					e.printStackTrace();
					exceptions.add(e);
				} finally {
					latch.countDown();
				}
			}
		}, String.format("%s-%d", group.getName(), index));

		result.setDaemon(true);
		result.start();
		return result;
	}

	void threadLoop(final int iterations) {
		for (int i = 1; i <= iterations; i++) {
			if (DEBUG) {
				System.out.printf(
					"Thread \"%s\" loading UML metamodel, pass %d.%n", Thread
						.currentThread().getName(), i);
			}

			ResourceSet rset = createResourceSet();
			Resource uml = rset.getResource(
				URI.createURI(UMLResource.UML_METAMODEL_URI), true);
			EcoreUtil.resolveAll(uml);
			destroyResourceSet(rset);

			if (DEBUG) {
				System.out.printf(
					"Thread \"%s\" unloaded UML metamodel, pass %d.%n", Thread
						.currentThread().getName(), i);
			}
		}
	}

	private ResourceSet createResourceSet() {
		ResourceSet result = new ResourceSetImpl();

		result.eAdapters().add(new CacheAdapter());

		if (StandaloneSupport.isStandalone()) {
			// init touches some global registries, which may not be accessed
			// concurrently by multiple threads, so be careful to avoid
			// concurrent modifications and indices out of bounds
			synchronized (this) {
				StandaloneSupport.init(result);
			}
		}

		return result;
	}

	private void destroyResourceSet(ResourceSet rset) {
		for (Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
	}

	private static final class StatsCounter {

		private final double[] samples = new double[SAMPLES];

		private int count = 0;

		private boolean warmedUp;

		private long start;

		void start() {
			start = System.currentTimeMillis();
		}

		long sample() {
			long result = System.currentTimeMillis() - start;

			// discard the first sample as it represents the cold state
			if (warmedUp) {
				samples[count++] = ((double) result) / 1000.0;
			} else {
				warmedUp = true;
			}

			return result;
		}

		double mean() {
			double result = 0;

			for (int i = 0; i < count; i++) {
				result = result + samples[i];
			}

			result = result / ((double) count);

			return result;
		}

		double stddev() {
			final double mean = mean();
			double sumOfDevSqs = 0.0;

			for (int i = 0; i < count; i++) {
				double dev = samples[i] - mean;
				sumOfDevSqs = sumOfDevSqs + (dev * dev);
			}

			return Math.sqrt(sumOfDevSqs / ((double) (count - 1)));
		}
	}
}
