package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.unioulu.tol.sqat.bsc.Frame;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;

public class TestBowlingScoreCalculator {

	@Test
	public void test() {
		//arrange
		BowlingGame bowlingGame = new BowlingGame();
		int firstThrow = 2;
		int secondThrow = 4;
		Frame frame = new Frame(firstThrow, secondThrow);
		//act
		bowlingGame.addFrame(frame);
		//assert
		assertEquals(firstThrow, secondThrow);
	}

	
}

