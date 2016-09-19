/*
 * Copyright (c) 2016 Christian W. Damus and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.tests.util;

/**
 * A convenience for timing of executions in tests.
 */
public class Stopwatch {

	// The size of a sample large enough to exclude outliers
	private static final int LARGE_SAMPLE = 10;

	private long startMillis;

	private long[] samples;

	private int iterations;

	private int minSampleIdx;

	private int maxSampleIdx;

	private double averageMillis;

	private double stdevMillis;

	public Stopwatch() {
		super();
	}

	/**
	 * Reset all statistics.
	 */
	public void reset() {
		startMillis = 0L;
		iterations = 0;
		averageMillis = 0.0;
		stdevMillis = 0.0;
		samples = null;
		minSampleIdx = 0;
		maxSampleIdx = 0;
	}

	/**
	 * Start timing an iteration.
	 */
	public void start() {
		startMillis = System.currentTimeMillis();
	}

	/**
	 * Finish timing an iteration and recompute statistics.
	 */
	public void end() {
		long endMillis = System.currentTimeMillis();

		// Record the new sample
		int index = iterations;
		iterations = index + 1;
		long sample = endMillis - startMillis;
		samples = grow(samples, iterations);
		samples[iterations - 1] = sample;

		// Recompute stats

		if (samples[index] < samples[minSampleIdx]) {
			minSampleIdx = index;
		}
		if (samples[index] > samples[maxSampleIdx]) {
			maxSampleIdx = index;
		}
		averageMillis = sample;
		stdevMillis = 0.0;

		if (iterations > 1) {
			// We have some stats to compute
			double sum = 0.0;

			// If we have more than a few samples, then we toss
			// the high and low outliers
			int sampleSize = sampleSize();

			// Compute the sum of samples
			for (int i = 0; i < iterations; i++) {
				if (!isOutlier(i)) {
					sum = sum + samples[i];
				}
			}

			averageMillis = sum / sampleSize;

			// And a standard deviation
			double sumDevSq = 0.0;
			for (int i = 0; i < iterations; i++) {
				if (!isOutlier(i)) {
					double dev = samples[i] - averageMillis;
					sumDevSq = sumDevSq + (dev * dev);
				}
			}
			stdevMillis = Math.sqrt(sumDevSq / (sampleSize - 1));
		}
	}

	private int sampleSize() {
		return (iterations >= LARGE_SAMPLE)
			? iterations - 2
			: iterations;
	}

	private boolean isOutlier(int sampleIndex) {
		return (iterations >= LARGE_SAMPLE)
			&& ((sampleIndex == minSampleIdx) || (sampleIndex == maxSampleIdx));
	}

	/**
	 * How many iterations have we timed?
	 * 
	 * @return the number of iterations
	 */
	public int iterations() {
		return iterations;
	}

	/**
	 * What is the average timing of an iteration?
	 * 
	 * @return the average iteration
	 */
	public double averageMillis() {
		return averageMillis;
	}

	/**
	 * What is the sample standard deviation of the timings of all iterations?
	 * 
	 * @return the iteration sample standard deviation
	 */
	public double stdevMillis() {
		return stdevMillis;
	}

	public void log(String message) {
		if (message != null) {
			System.out.printf("%s: ", message);
		}
		System.out.printf("%3.2f ms (σ = %01.3f ms) on %d iterations%n",
			averageMillis(), stdevMillis(), iterations());
	}

	private long[] grow(long[] array, int minCapacity) {
		long[] result;

		if (array == null) {
			result = new long[Math.max(minCapacity, 10)];
		} else if (array.length >= minCapacity) {
			result = array;
		} else {
			result = new long[Math.max(minCapacity, 10) * 5 / 3];
			System.arraycopy(array, 0, result, 0, array.length);
		}

		return result;
	}
}
