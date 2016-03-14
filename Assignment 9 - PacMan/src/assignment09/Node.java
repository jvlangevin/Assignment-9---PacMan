package assignment09;

import java.util.List;

public class Node{

	private Object data;
	private boolean visited;
	private Node cameFrom;
	private int indegree;
	private List<Node> neighbors;
		
	//on construct without anything passed in the (), these values are assigned
	public Node(){
		this.data = null;
		this.visited = false;
		this.cameFrom = null;
		this.indegree = 0;
		this.neighbors = null;
		
	}
	
	//if only an object is passed in the constructor, it assigns that value to this node
	public Node(Object data){
		this();
		this.data = data;
	}
	
	
	/**
	 * setData is used to change the object in an already existing node 
	 * such as a '.' when we find our path after the search
	 * @param data
	 */
	public void setData(Object data){
		this.data = data;
	}
	
	
	/**
	 * getData is used to return the value of data in the Node it was called on
	 * used when calling the printMap function
	 * @return
	 */
	public Object getData(){
		return this.data;
	}
	
	
	/**
	 * This method assigns a neighbor node to this node
	 * currently unused - just anticipating it's use
	 * @param neighborNode
	 */
	public void addNeighbors(Node neighborNode){
		this.neighbors.add(neighborNode);
	}
	
}
