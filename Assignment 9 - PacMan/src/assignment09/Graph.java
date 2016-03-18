package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Graph {

	private Node[][] nodes;
	private Node start;
	private Node goal;
	private char[][] maze;
	private int height;
	private int width;
	private boolean goalReached;

	/**
	 * Constructs the graph object.
	 * 
	 * On construct, reads a file and assigns the row column placement of each character in the file to maze[][]. This
	 * is accomplished by readMapFromFile. The constructor, when called, will need the string name of the file. After
	 * maze is initialized, assigns that character to a 2D matrix of Nodes with the corresponding row column value found
	 * in maze[][]. If 'X' is the character, the object that enters the node at that position is a null value.
	 */

	public Graph(String inputFile){
		this.maze = this.readMapFromFile(inputFile);
		this.goalReached = false;
		this.nodes = new Node[this.height][this.width];

		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {

				if (this.maze[i][j] != 'X') {
					// this is the node constructor
					// on construct of new node, the new node is assigned the
					// value of the object passed in Node(Object).
					this.nodes[i][j] = new Node((Object) this.maze[i][j]);

					if (this.maze[i][j] == 'S') {
						this.start = this.nodes[i][j];
					}

					if (maze[i][j] == 'G') {
						this.goal = this.nodes[i][j];
					}
					
					/*
					 * Determine the number of neighbors of the current node. Note that we only check the node above the
					 * current node and the node to the left of the current node. Since we're constructing the graph top
					 * to bottom and left to right, the nodes at [i][j+1] and at [i+1][j] will not have been initialized
					 * yet.
					 */
					if (this.maze[i - 1][j] != 'X') {
						this.nodes[i][j].addNeighbor(this.nodes[i - 1][j]);
						this.nodes[i - 1][j].addNeighbor(this.nodes[i][j]);
					}
					if (this.maze[i][j - 1] != 'X') {
						this.nodes[i][j].addNeighbor(this.nodes[i][j - 1]);
						this.nodes[i][j - 1].addNeighbor(this.nodes[i][j]);
					}

				}
				else {
					// value of null gets assigned to this node if it's an 'X'
					this.nodes[i][j] = new Node('X');
				}
			}
		}

	}

	/**
	 * Helper method for testing; returns the value of the node at [row][column] if showNulls = true, return value will
	 * be null if node object is null. if showNulls = false, return value will be X if node object is null. Used in
	 * method printMap currently.
	 * 
	 * @return
	 */
	public Object printNodeDataHelper(int row, int column) {

		if (this.getNode(row, column).getData() == null) {
			return 'X';
		}
		else {
			return this.getNode(row, column).getData();
		}

	}



	/**
	 * Returns the node at the indicated position in the maze.
	 */
	public Node getNode(int row, int col) {
		return this.nodes[row][col];
	}

	/**
	 * Helper method - prints each node's value to make sure map was correctly transferred to nodes. if param = false,
	 * converts null values to X
	 *
	 **/
	public String printMap() {

		String returnValue = "" + this.height + ' ' + this.width + '\n';

		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				returnValue += this.printNodeDataHelper(i, j);
			}
			returnValue += '\n';
		}
		return returnValue;
	}

	public void breadthFirstSearch() {

		this.start.setVisited();
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.start);

		while (!queue.isEmpty()) {
			Node current = queue.remove();

			for (Node node : current.getNeighbors()) {
				if (!node.visited() && this.goalReached == false) {
					node.setCameFrom(current);
					if (node != this.goal) {
						node.setVisited();
						queue.add(node);
					}
					else {
						this.goalReached = true;
						queue.clear();
					}
				}
			}
		}
		
		if (this.goalReached) {

			Node previous = this.goal.cameFrom();

			while (previous.cameFrom() != null) {

				previous.setData('.');
				previous = previous.cameFrom();
			}
		}
		
		
	}
		
	/**
	 * This method will be called in the constructor. It takes the text file and converts it to a character matrix that
	 * can be looped over to assign character values to our nodes as well as a row and column for our nodes
	 * 
	 * @param filename:
	 *            the file we are pulling the text map from
	 * @return: a character matrix so we have a position system of which to assign nodes and values
	 * @throws IOException
	 */
	private char[][] readMapFromFile(String filename) {

		File file = new File(filename);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String[] dimensions = null;
		try {
			dimensions = reader.readLine().split(" ");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		// sets our height and width
		this.height = Integer.parseInt(dimensions[0]);
		this.width = Integer.parseInt(dimensions[1]);

		// builds our mapArray which we can use to input into Nodes
		char[][] mapArray = new char[this.height][this.width];

		for (int i = 0; i < this.height; i++) {
			// puts a character array in each row, giving us a mapArray[row][characterArray/column]
			try {
				mapArray[i] = reader.readLine().toCharArray();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

		}

		return mapArray;

	}

	/**
	 * Returns the number of steps in the path of a solved maze.
	 */
	public int getStepCount() {

		int stepCount = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((char)nodes[i][j].getData() == '.') {
					stepCount++;
				}
			}
		}
		return stepCount;
	}

}
