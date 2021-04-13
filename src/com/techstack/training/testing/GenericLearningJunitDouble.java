package com.techstack.training.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techstack.training.generics.GenericLearningDemo;

class GenericLearningJunitDouble {

	@Test
	void test() {
		System.out.println("Inside Double Test Case.");
		GenericLearningDemo<Double> genricsFloat = new GenericLearningDemo<Double>(3.5, 8.8, 6.7);
		double maxDouble = genricsFloat.max(genricsFloat.getX(), genricsFloat.getY(), genricsFloat.getZ());
		assertEquals(8.8, maxDouble);
	}

}
