package assignment09;

import java.util.List;

public class Node<E> {

	private E data;
	private boolean visited;
	private Node<E> cameFrom;
	private int indegree;
	private List<Node<E>> neighbors;
}
