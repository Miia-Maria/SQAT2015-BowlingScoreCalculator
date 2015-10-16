package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.unioulu.tol.sqat.bsc.Frame;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;

public class TestBowlingScoreCalculator {

	@Test
	public void testInOneFrameThereIsTwoThrows() {
		//arrange
		Frame frame = new Frame(2,4);
		int numberOfThrows = 2;
		//act
		frame.addThrows(numberOfThrows);
		//assert
		assertEquals(2, numberOfThrows);
	}	
}

