package icpc;
import java.io.*;
import java.util.*;
public class OrderlyClass {
	public static void main(String[]args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String s1 = br.readLine();
		String s2 = br.readLine();
		String reverse = "";
		String interval = ""; 
		int start = -1;
		int end = -1;
		boolean cont = false;
		for(int i = 0; i < s1.length()-1; i++)
		{
			String a = s1.substring(i,i+1);
			String b = s2.substring(i,i+1);
			String a1 = s1.substring(i+1,i+2);
			String b1 = s2.substring(i+1,i+2);
		   if(!a.equals(b))
		   {
			   start = i;
			   break;
		   }
           if((a).equals(b)&&(!(a1).equals(b1)))
           {
        	   start = i+1; 
        	   break;
           }
		}
		for(int i = s1.length()-1; i > 0; i--)
		{
			String a = s1.substring(i,i+1);
			String b = s2.substring(i,i+1);
			String a1 = s1.substring(i-1,i);
			String b1 = s2.substring(i-1,i);
		   if(!a.equals(b))
		   {
			   end = i;
			   break;
		   }
           if((a).equals(b)&&(!(a1).equals(b1)))
           {
        	   end = i-1; 
        	   break;
           }
		}
		int count = 0;
		if(end > start)
		{
		StringBuilder build = new StringBuilder();
		build.append(s2.substring(start,end+1));
		build.reverse();
		String groupA = s1.substring(start,end+1);
		String groupB = build.toString();
		if(groupA.equals(groupB))
		{
			count++;
		  while(end < s1.length()-1 && start > 0)
		  {
			  String a = s1.substring(start-1,start);
			  String b = s2.substring(end+1,end+2);
			  if(a.equals(b))
			  {
				  count++;
			  }
			  else
			  break;
			  end++;
			  start--;
		  }
		}
		}
		System.out.println(count);
	}
}
