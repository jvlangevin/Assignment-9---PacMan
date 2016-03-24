package assignment09;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the shortest-path algorithm of the Graph class.
 * @author Jason Langevin, Nathan Novak
 *
 */
public class GraphTest {

	@Test
	public void testBigMaze() {
		Graph testBFS = new Graph("mazes/mazes/bigMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/bigMazeSol.txt");
		
		testBFS.breadthFirstSearch();
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());

	}
	
	@Test
	public void testBigMazeSwapped() {
		Graph testBFS = new Graph("mazes/mazes/bigMaze.txt");
		Graph testSwapped = new Graph("mazes/mazes/bigMazeSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());

	}
	
	@Test
	public void testClassic() {
		Graph testBFS = new Graph("mazes/mazes/classic.txt");
		Graph testSolution = new Graph("mazes/mazes/classicSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testClassicSwapped() {
		Graph testBFS = new Graph("mazes/mazes/classic.txt");
		Graph testSwapped = new Graph("mazes/mazes/classicSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	
	@Test
	public void testDemoMaze() {
		Graph testBFS = new Graph("mazes/mazes/demoMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/demoMazeSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testDemoMazeSwapped() {
		Graph testBFS = new Graph("mazes/mazes/demoMaze.txt");
		Graph testSwapped = new Graph("mazes/mazes/demoMazeSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testMediumMaze() {
		Graph testBFS = new Graph("mazes/mazes/mediumMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/mediumMazeSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testMediumMazeSwapped() {
		Graph testBFS = new Graph("mazes/mazes/mediumMaze.txt");
		Graph testSwapped = new Graph("mazes/mazes/mediumMazeSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testRandomMaze() {
		Graph testBFS = new Graph("mazes/mazes/randomMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/randomMazeSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testRandomMazeSwapped() {
		Graph testBFS = new Graph("mazes/mazes/randomMaze.txt");
		Graph testSwapped = new Graph("mazes/mazes/randomMazeSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testStraight() {
		Graph testBFS = new Graph("mazes/mazes/straight.txt");
		Graph testSolution = new Graph("mazes/mazes/straightSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testStraightSwapped() {
		Graph testBFS = new Graph("mazes/mazes/straight.txt");
		Graph testSwapped = new Graph("mazes/mazes/straightSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testTinyMaze() {
		Graph testBFS = new Graph("mazes/mazes/tinyMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/tinyMazeSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testTinyMazeSwapped() {
		Graph testBFS = new Graph("mazes/mazes/tinyMaze.txt");
		Graph testSwapped = new Graph("mazes/mazes/tinyMazeSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testTinyOpen() {
		Graph testBFS = new Graph("mazes/mazes/tinyOpen.txt");
		Graph testSolution = new Graph("mazes/mazes/tinyOpenSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testTinyOpenSwapped() {
		Graph testBFS = new Graph("mazes/mazes/tinyOpen.txt");
		Graph testSwapped = new Graph("mazes/mazes/tinyOpenSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testTurn() {
		Graph testBFS = new Graph("mazes/mazes/turn.txt");
		Graph testSolution = new Graph("mazes/mazes/turnSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}
	
	@Test
	public void testTurnSwapped() {
		Graph testBFS = new Graph("mazes/mazes/turn.txt");
		Graph testSwapped = new Graph("mazes/mazes/turnSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
	
	@Test
	public void testUnsolvable() {
		Graph testBFS = new Graph("mazes/mazes/unsolvable.txt");
		Graph testSolution = new Graph("mazes/mazes/unsolvableSol.txt");
		
		testBFS.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSolution.getStepCount());
		
	}

	
	@Test
	public void testUnsolvableSwapped() {
		Graph testBFS = new Graph("mazes/mazes/unsolvable.txt");
		Graph testSwapped = new Graph("mazes/mazes/unsolvableSwapped.txt");
		
		testBFS.breadthFirstSearch();
		testSwapped.breadthFirstSearch();
		
		assertEquals(true, testBFS.getStepCount() == testSwapped.getStepCount());
		
	}
}
