package icpc;
import java.io.*;
import java.util.*;
public class TheKeyToCryptography {
	public static void main(String[]args) throws Exception
	 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String k = br.readLine();
		String n = br.readLine();
		char[]n1 = n.toCharArray();
		char[]k1 = k.toCharArray();
		char[]s = new char[k.length()];
		ArrayList<Integer>p = new ArrayList<Integer>();
		for(int i = 0; i < k.length(); i++)
		{
		  if(i < n1.length)
		  {
		  int d = ((int)k1[i] + (65 - (int)(n1[i])));   
		  if(d < 65)
		  {
			  s[i] = (char)(90 - (64 - d));
		  }
		  else
			s[i] = (char)d;
		  
		  p.add((int)s[i]);
		  }
		  else
		  {
			  int z = ((int)(k1[i]) + (65 - p.get(i-n1.length)));   
			  if(z < 65)
			  {
				  s[i] = (char)(90 - (64 - z));
			  }
			  else
				  s[i] = (char)z;
				  
			  p.add((int)s[i]);
		  }
		  }
		System.out.println(String.valueOf(s));
		
	 }
}
