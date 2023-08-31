package icpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NoDuplicates {
	public static void main(String[]args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		boolean t = true;
		while(str.hasMoreTokens())
		{
			String s = str.nextToken();
			if(map.containsKey(s) && t)
			{
				System.out.println("no");
				t = false;
			}
			map.put(s,0);
		}
		if(t)
		System.out.println("yes");
		
		
	}
	
}
