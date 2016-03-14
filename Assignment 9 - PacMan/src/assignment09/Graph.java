package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Graph<E> {

	private Node[][] nodes;
	private char[][] maze;
	private int height;
	private int width;
	
	/**
	 * Base level constructor
	 */
	public Graph(){
		this.nodes = new Node[height][width];
	}
	
	public Graph(String inputFile) throws IOException{
		
		maze = this.readMapFromFile(inputFile);	
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; i < width; j++)
			{
				nodes[i][j].setData(maze[i][j]); 
			}
		}
		
	}
	
	public E breadthFirstSearch(Node current, Node goal){
		
		return null;
	}
	
	public E depthFirstSearch(Node current, Node goal){
		
		return null;
	}
	
	public List<E> topologicalSort(Graph<E> graph){

		return null;
	}
	
	
	/**
	 * This method will be called in the constructor. It takes the text file and converts it
	 * to a character matrix that can be looped over to assign character values to our nodes
	 * as well as a row and column for our nodes
	 * 
	 * @param filename: the file we are pulling the text map from
	 * @return: a character matrix so we have a position system of which to assign nodes and values
	 * @throws IOException
	 */
	private char[][] readMapFromFile(String filename) throws IOException{

	    File file = new File(filename);
	    BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  String[] dimensions = reader.readLine().split(" ");

		  //sets our height and width
		  this.height = Integer.parseInt(dimensions[0]);
		  this.width = Integer.parseInt(dimensions[1]);
		  
		  //builds our mapArray which we can use to input into Nodes
		  char[][] mapArray = new char[this.height][this.width];
		  
		  for(int i = 0; i < this.height; i++)
		  {
			  //puts a character array in each row, giving us a mapArray[row][characterArray/column]
			  mapArray[i] = reader.readLine().toCharArray();			  
		  }
		  
		  return mapArray;

	}

	
}
