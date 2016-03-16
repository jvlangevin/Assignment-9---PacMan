package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphMethodTest {

	public static void test(Graph test, Graph solution){
		
		if (test.getStepCount() <= solution.getStepCount()){
			System.out.println("Solution correct!");
		}
		else{
			System.out.println("Solution incorrect.");
		}
	}
	
	public static void main(String[] args){
		
		Graph testBFS = new Graph("mazes/mazes/bigMaze.txt");
		Graph testSolution = new Graph("mazes/mazes/bigMazeSol.txt"); 
		
		testBFS.breadthFirstSearch(testBFS.getStart(), testBFS.getGoal());
		
		test(testBFS, testSolution);
			
}
}
