package icpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TiredTerry {
	public static int[]vals;
	public static int[]reverse;
	public static int size;
	public static int[]prefix;
	public static int getNegative(int n)
	{
		n = -1*n;
		int factor = n/size;
		int left = n%size;
		return  prefix[size-1] - prefix[size-(left+1)] + (prefix[size-1]*factor);
	}
	public static void main(String[]args) throws Exception
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer str = new StringTokenizer(br.readLine());
		 int n= Integer.parseInt(str.nextToken());
		 int p= Integer.parseInt(str.nextToken());
		 int d= Integer.parseInt(str.nextToken());
		 String sequence = br.readLine();
		 size = sequence.length();
		 vals = new int[size+1];
		 prefix = new int[size+1];  
		 for(int i = 0; i < sequence.length();i++)
		 {
			 if(sequence.substring(i,i+1).equals("W"))
			 {
				 vals[i] = 0;
			 }
			 else
				 vals[i] = 1;
			 
			 if(i==0)
             {
            	 prefix[i] = vals[i];
            	 continue;
             }
			prefix[i] = prefix[i-1] + vals[i];
			//System.out.println(prefix[i]);
		 }
		 int count = 0;
		 for(int i = 0; i < sequence.length(); i++)
		 {
			 int sum = 0;
			 int s = i - p + 1;
			 if(s < 0)
			 {
			 sum += getNegative(s);
			 s = 0;
			 }
			 
			 if(s == 0)
			 {
				 sum += prefix[i];
			 }
			 else
			 {
			 sum += prefix[i] - prefix[i - s];
			 }
			if(sum < d)
			 count++;
		 }
		 System.out.println(count);
		 
	 }
}
