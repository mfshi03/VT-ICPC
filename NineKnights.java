package icpc;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class NineKnights {
	public static void main(String[]args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = true;
		ArrayList<Point> map = new ArrayList<Point>();
		int count = 0;
	   for(int i = 0; i < 5; i++)
		{
			String[] str = br.readLine().split("");
		  for(int j = 0; j < str.length; j++)
		  {
			   String s = str[j];
			   if(s.equals("k"))
			   {
				   count++;
				   if(map.contains(new Point(i,j)))
				   {
					   valid = false;
				   }
				   map.add(new Point(i+2,j+1));
				   map.add(new Point(i+2,j-1));
				   map.add(new Point(i-2,j+1));
				   map.add(new Point(i-2,j-1));
				   map.add(new Point(i+1,j+2));
				   map.add(new Point(i+1,j-2));
				   map.add(new Point(i-1,j+2));
				   map.add(new Point(i-1,j-2));
				   
			   }
			}
		}

	   if(valid && count == 9)
	    System.out.println("valid");
	   else
		 System.out.println("invalid");
		
	}
}
