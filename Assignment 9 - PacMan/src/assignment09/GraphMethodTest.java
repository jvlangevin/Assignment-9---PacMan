package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphMethodTest {

	public static void main(String[] args){
		
		
		
		Graph testBFS = new Graph("mazes/mazes/demoMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/demoMazeSol.txt");
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		//false value changes nulls to 'X'
		if(testBFS.printMap().equals(testSolution.printMap()));
		{
			System.out.println("Solution correct!");
		}
		
		if(!testBFS.printMap().equals(testSolution.printMap())){
			System.out.println("Solution incorrect.");
		}
	   
		
	}
}
