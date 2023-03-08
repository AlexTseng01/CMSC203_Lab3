import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook score1, score2;
	
	@BeforeEach
	void setUp() throws Exception {
		score1 = new GradeBook(5);
		score1.addScore(80.2);
		score1.addScore(67.5);
		score1.addScore(80.2);
		score1.addScore(67.5);
		score1.addScore(67.5);
		
		score2 = new GradeBook(5);
		score2.addScore(76.2);
		score2.addScore(75.5);
		score2.addScore(76.2);
		score2.addScore(75.5);
		score2.addScore(75.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		score1 = null;
		score2 = null;
	}
	
	/*
	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}
	
	
	@Test
	void testToString() {
		fail("Not yet implemented");
	}
	*/

	@Test
	void testAddScore() {
		assertTrue(score1.toString().equals("80.2 67.5 80.2 67.5 67.5 "));
		assertTrue(score2.toString().equals("76.2 75.5 76.2 75.5 75.5 "));
		
		assertEquals(5, score1.getScoreSize());
		assertEquals(5, score2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(362.9, score1.sum());
		assertEquals(378.9, score2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(67.5, score1.minimum());
		assertEquals(75.5, score2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(295.4, score1.finalScore());
		assertEquals(303.4, score2.finalScore());
	}

}
