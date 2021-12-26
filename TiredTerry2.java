package icpc;
import java.io.*;
import java.util.*;
public class TiredTerry2 {
public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer str = new StringTokenizer(br.readLine());
	 int n= Integer.parseInt(str.nextToken());
	 int p= Integer.parseInt(str.nextToken());
	 int d= Integer.parseInt(str.nextToken());
	 int interval = p - 1; 
	 String s = br.readLine();
	 char[]a = (s+s).toCharArray();
	 int tired = 0; 
	 int count = 0;
	 for(int i = n; i < 2*n; i++)
	 {
		if(i == n)
		{
        for(int j = 0; j <= interval; j++)
        {
              if(a[i - j] == 'Z')
            	 count++;
        }
		}
		else
		{
			int subtract = 0;
			int add = 0; 
		  if(a[i - (interval+1)] == 'Z')
			subtract = 1;
		  if(a[i] == 'Z')
			  add = 1; 
			count = count - subtract + add;
		}
        if(count < d)
        	tired++;	 
	 }
	 System.out.println(tired);
	 
	 
}
}
