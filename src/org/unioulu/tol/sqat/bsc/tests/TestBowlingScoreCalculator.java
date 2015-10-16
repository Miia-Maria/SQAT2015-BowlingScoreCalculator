package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.unioulu.tol.sqat.bsc.Frame;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;

public class TestBowlingScoreCalculator {

	@Test
	public void testInOneFrameThereIsTwoThrows() {
		//arrange
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,0);
		int numberOfThrows = 0;
		//act
		frame.addThrows(numberOfThrows);
		//assert
		assertEquals(2, numberOfThrows);
	}

	
}

