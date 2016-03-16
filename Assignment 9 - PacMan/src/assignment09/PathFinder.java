package assignment09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PathFinder {

	public static void solveMaze(String inputFile, String outputFile) throws IOException{
		
		Graph testGraph = new Graph(inputFile);
		testGraph.breadthFirstSearch(testGraph.getStart(), testGraph.getGoal());
		
		PrintStream output = new PrintStream(new FileOutputStream(outputFile));
		output.print(testGraph.printMap());
		output.close();
		
	}
	
}
