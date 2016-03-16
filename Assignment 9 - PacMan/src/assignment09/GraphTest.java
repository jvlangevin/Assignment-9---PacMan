package assignment09;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {

	@Test
	public void testBigMaze() {
		Graph testBFS = new Graph("mazes/mazes/bigMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/bigMazeSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());

	}
	
	@Test
	public void testClassic() {
		Graph testBFS = new Graph("mazes/mazes/classic.txt");
		Graph testSolution = new Graph("mazes/mazes/classicSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testDemoMaze() {
		Graph testBFS = new Graph("mazes/mazes/demoMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/demoMazeSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testMediumMaze() {
		Graph testBFS = new Graph("mazes/mazes/mediumMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/mediumMazeSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testRandomMaze() {
		Graph testBFS = new Graph("mazes/mazes/randomMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/randomMazeSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testStraight() {
		Graph testBFS = new Graph("mazes/mazes/straight.txt");
		Graph testSolution = new Graph("mazes/mazes/straightSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testTinyMaze() {
		Graph testBFS = new Graph("mazes/mazes/tinyMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/tinyMazeSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testTinyOpen() {
		Graph testBFS = new Graph("mazes/mazes/tinyOpen.txt");
		Graph testSolution = new Graph("mazes/mazes/tinyOpenSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testTurn() {
		Graph testBFS = new Graph("mazes/mazes/turn.txt");
		Graph testSolution = new Graph("mazes/mazes/turnSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testUnsolvable() {
		Graph testBFS = new Graph("mazes/mazes/unsolvable.txt");
		Graph testSolution = new Graph("mazes/mazes/unsolvableSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}

}
