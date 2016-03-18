package assignment09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PathFinder {

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
}
