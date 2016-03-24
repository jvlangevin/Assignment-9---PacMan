package assignment09;

import java.util.ArrayList;

/**
 * A node object to be used in a graph.
 * @author Jason Langevin, Nathan Novak
 *
 */
public class Node{

	private Object data;
	private boolean visited;
	private Node cameFrom;
	private ArrayList<Node> neighbors;
		
	/**
	 * Base level constructor. Initializes member variables.
	 */
	public Node(){
		this.data = null;
		this.visited = false;
		this.cameFrom = null;
		this.neighbors = new ArrayList<Node>();
	}
	
	/**
	 * 
	 * @param data - the value contained inside the node
	 */
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
	 * Returns the list of nodes that connect to this node.
	 */
	public ArrayList<Node> getNeighbors(){
		return this.neighbors;
	}
	
	/**
	 * Adds the specified node to this node's list of neighbors.
	 * @param neighborNode -- a node that connects to this node
	 */
	public void addNeighbor(Node neighborNode){
		this.neighbors.add(neighborNode);
	}
	
	/**
	 * @return
	 * 	True if this node has been visited, false otherwise
	 */
	public boolean visited(){
		return (this.visited);
	}
	
	/**
	 * Marks this node as having been visited.
	 */
	public void setVisited(){
		this.visited = true;
	}
	
	/**
	 * Returns the node that was visited previous to this node.
	 */
	public Node cameFrom(){
		return cameFrom;
	}
	/**
	 * Sets the specified node as the one that was visited prior to this node.
	 * @param node - the node that preceded this node
	 */ 
	public void setCameFrom(Node node){
		this.cameFrom = node;
	}
	
}
