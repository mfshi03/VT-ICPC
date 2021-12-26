package icpc;
import java.io.*;
import java.util.*;
public class RedRover {
public static void main(String[]args)throws Exception
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String s = br.readLine();
 int min = s.length();
	for(int i = 0; i < s.length(); i++)
	{
		for(int j = i+1; j < s.length(); j++)
		{
			String n = s.substring(i,j);
			String f = s.replaceAll(n,"M");
			min = Math.min(min, f.length() + n.length());
		}
	}
	System.out.println(min);
}
}
