package assignment09;

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
		
		testBFS.breadthFirstSearch();
		
		test(testBFS, testSolution);
			
	}
}
