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
	 * Constructs the graph object.
	 * 
	 * On construct, reads a file and assigns the row column placement of each character
	 * in the file to maze[][]. This is accomplised by readMapFromFile.
	 * The constructor, when called, will need the string name of the file.
	 * After maze is initialized, assigns that character to a 2D matrix of Nodes
	 * with the corresponding row column value found in maze[][]. If 'X' is the character,
	 * the object that enters the node at that position is a null value.
	 */
	
	public Graph(String inputFile) throws IOException{
		maze = this.readMapFromFile(inputFile);	
		this.nodes = new Node[this.height][this.width];
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(maze[i][j] != 'X'){
					//this is the node constructor
					//on construct of new node, the new node is assigned the
					//value of the object passed in Node(Object). 
					this.nodes[i][j] = new Node((Object)maze[i][j]); 
				}
				else{
					//value of null gets assigned to this node if it's an 'X'
					this.nodes[i][j] = new Node(null);
				}
			}
		}
		
	}
	
	/**
	 * Helper method for testing; returns the value of the node at [row][column]
	 * if showNulls = true, return value will be null if node object is null. if
	 * showNulls = false, return value will be X if node object is null.  Used in
	 * method printMap currently.
	 * @return
	 */
	public Object printNodeDataHelper(int row, int column, boolean showNulls){
		if(showNulls == true){
			return nodes[row][column].getData();
		}
		else{
			if(nodes[row][column].getData() == null){
				return 'X';
			}
			else{
				return nodes[row][column].getData();
			}
		}
	}
	
	
	/**
	 * Helper method for printing the map
	 * @return
	 */
	public int getHeight(){
		return this.height;
	}
	
	/**
	 * Helper method for printing the map
	 */
	public int getWidth(){
		return this.width;
	}
	
	/**
	 * Helper method - prints each node's value to make sure map was 
	 * correctly transferred to nodes. if param = false, converts null values to X
	 * @param showNulls - when true, map is printed with nulls, when false, printed with X in it's place
	 */
	public void printMap(boolean showNulls){
		for(int i = 0; i < this.getHeight(); i++)
		{
			for(int j = 0; j < this.getWidth(); j++)
			{
				System.out.print(this.printNodeDataHelper(i,j, showNulls));
			}
			System.out.print('\n');
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
