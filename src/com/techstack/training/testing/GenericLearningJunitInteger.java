package com.techstack.training.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techstack.training.generics.GenericLearningDemo;

class GenericLearningInterger {

	@Test
	void test() {
		System.out.println("Inside Integer Test Case.");
		GenericLearningDemo<Integer> genricsInt = new GenericLearningDemo<Integer>(6, 8, 7);
		int maxInt = genricsInt.max(genricsInt.getX(), genricsInt.getY(), genricsInt.getZ());
		assertEquals(8, maxInt);
	}

}
