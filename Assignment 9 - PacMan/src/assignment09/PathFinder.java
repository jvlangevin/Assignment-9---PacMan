package assignment09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Implements the solveMaze method.
 * @author Jason Langevin, Nathan Novak
 *
 */
public class PathFinder {

	/**
	 * Reads the specified input file and outputs the solution of the maze to 
	 * a separate file.
	 * 
	 * @param inputFile -- a file containing an unsolved maze
	 * @param outputFile -- the name of the file that the maze solution will be written to
	 */
	public static void solveMaze(String inputFile, String outputFile) {

		try {
			Graph testGraph = new Graph(inputFile);
			testGraph.breadthFirstSearch();
			PrintStream output;
			output = new PrintStream(new FileOutputStream(outputFile));
			output.print(testGraph.printMap());
			output.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
