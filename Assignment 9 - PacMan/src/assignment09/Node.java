package assignment09;

import java.util.List;

public class Node{

	private char data;
	private boolean visited;
	private Node cameFrom;
	private int indegree;
	private List<Node> neighbors;
		
	public void setData(char data){
		this.data = data;
	}
	
}
