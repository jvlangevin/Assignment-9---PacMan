package assignment09;

import java.io.IOException;

public class PathFinder {

	public static void solveMaze(String inputFile, String outputFile){
		
		Graph testGraph = new Graph(inputFile);
		
		
		testGraph.breadthFirstSearch(testGraph.getStart(), testGraph.getGoal());
		System.out.print(testGraph.printMap());
		
	}

}
