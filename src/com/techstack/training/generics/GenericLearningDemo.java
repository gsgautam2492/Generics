package com.techstack.training.generics;

import java.util.*;

public class GenericLearningDemo<T> {

	T x, y, z;

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public GenericLearningDemo(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T getX() {
		return x;
	}

	public T getY() {
		return y;
	}

	public T getZ() {
		return z;
	}

	public String printMax(T x, T y, T z, T max) {
		return "Max [x=" + x + ", y=" + y + ", z=" + z + ", max" + max + "]";

	}

	public <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0)
			max = y; // y is the largest so far

		if (z.compareTo(max) > 0)
			max = z; // z is the largest

		return max; // returns the largest object
	} // end method max
}
