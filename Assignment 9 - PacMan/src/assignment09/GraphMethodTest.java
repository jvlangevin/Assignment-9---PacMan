package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphMethodTest {

	public static <E> void main(String[] args) throws IOException{
		
		
		
		Graph<E> testGraph = new Graph("mazes/mazes/mediumMaze.txt");
		
		//false value changes nulls to 'X'
		testGraph.printMap(false);
	   
		
	}
}
