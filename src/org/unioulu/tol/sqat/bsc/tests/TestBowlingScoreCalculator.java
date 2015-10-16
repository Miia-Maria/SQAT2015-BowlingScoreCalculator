package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;

public class TestBowlingScoreCalculator {

	@Test
	public void test() {
		//arrange
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();
		int throwOne = 2;
		int throwTwo = 4;
		
		//act
		
		//assert
		assertEquals(throwOne, throwTwo);
	}

	
}

