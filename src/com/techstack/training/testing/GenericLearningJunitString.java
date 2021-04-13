package com.techstack.training.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techstack.training.generics.GenericLearningDemo;

class GenericLearningJunitString {

	@Test
	void test() {
		System.out.println("Inside String Test Case.");
		GenericLearningDemo<String> genricsString = new GenericLearningDemo<String>("Apple", "Pear", "Pinneapple");
		String maxString = genricsString.max(genricsString.getX(), genricsString.getY(), genricsString.getZ());
		assertEquals("Pinneapple", maxString);
	}

}
