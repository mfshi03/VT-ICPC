package icpc;
import java.io.*;
import java.util.*;
public class DFS {
	public static int n = 10;
	public static LinkedList<Integer>[]graph = new LinkedList[n];
	public static void DFS()
	{
	for(int i = 0; i < 10; i++)
	{
		Iterator n1 = graph[1].iterator();
	     while(n1.hasNext())
	     {
	    	int f =  (int)n1.next();
	    	
	     }
	}
	}
	public static void main(String[]args) throws Exception
	{
		boolean visited[] = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			graph[n] = new LinkedList<Integer>();
		}
		graph[1].add(5);
		graph[7].add(6);
		graph[3].add(7);
		
		
	}

}
