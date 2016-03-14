package assignment09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) throws IOException{
		
		
	    File file = new File("C:\\Users\\Nathan\\git\\Assignment-9---PacMan\\Assignment 9 - PacMan\\hello_world.txt");
	    BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  String[] dimensions = reader.readLine().split(" ");

		  
		  int height = Integer.parseInt(dimensions[0]);

		  int width = Integer.parseInt(dimensions[1]);
		  
		  
		  System.out.println(height);
		  System.out.println(width);
		  
		  char[][] mapArray = new char[height][width];
		  
		  for(int i = 0; i < height; i++)
		  {
			 				  
				  mapArray[i] = reader.readLine().toCharArray();			  
		  }
		  
		  
		  System.out.println(mapArray[1][0]);
		
	}
}
