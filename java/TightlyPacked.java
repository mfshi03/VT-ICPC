package icpc;
import java.io.*;
import java.util.*;
public class TightlyPacked {
public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long n = Long.parseLong(br.readLine());
	double n1 = (double)n;
	long a = 1;
	long b = 2;
	long lower = (long)Math.round(Math.sqrt(n1/2));
	long upper = (long)Math.round(Math.sqrt(2*n1));
	long least =  1000000000; 
	for(long i = lower; i <= upper; i++)
	{
		 long j = (long)Math.round(((double)n/(double)i));
		   long val = (i*j) - n;
			if(val >= 0)
		   least = Math.min(val, least);
		
	}
	System.out.println(least);
}
}
