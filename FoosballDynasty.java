package icpc;
import java.io.*;
import java.util.*;
public class FoosballDynasty {
	public static void swapOne(String[]team)
	{
		String b = team[2];
		team[2] = team[0];
		team[0] = b;
	}
	public static void swapTwo(String[]team)
	{
		String b = team[3];
		team[3] = team[1];
		team[1] = b;
		
	}
public static void main(String[]args)throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	Queue<String>line = new LinkedList();
	ArrayList<String>bestPlayerA = new ArrayList<String>();
	ArrayList<String>bestPlayerB = new ArrayList<String>();
	ArrayList<Integer>max = new ArrayList<Integer>();
	String[]teams = new String[4];
	StringTokenizer str = new StringTokenizer(br.readLine());
	 for(int i = 0; i < n; i++)
	{
      if(i < 4 )
      teams[i] = str.nextToken();
      else
      line.add(str.nextToken());
	}
	 String s = br.readLine();
	 String[]z = s.split("");
	 str = new StringTokenizer(s);
	 int maxStreak = 0;
	 int streak = 1; 
	 int replace = 0;
	 int keep = 0;
	 int firstSwaps  = 0; 
	 int secondSwaps = 0;
	 for(int i = 0; i < z.length; i++)
	 {
		 if(i > 0 &&  z[i-1].equals(z[i]))
		 {
			 streak++;
		 }
		 else
		 if(i > 0)
		 {
			 streak = 1;
		 }
		 
		 if(z[i].equals("W"))
		 {
			  if(secondSwaps%2 == 0)
			  {
			  String a = line.poll();
			  String b = teams[3];
			  String c = teams[1];
			  line.add(b);
              teams[3] = a;
              secondSwaps++;
			  }
			  else
			  {
				  String a = line.poll();
				  String b = teams[1];
				  swapTwo(teams);
				  line.add(b);
	              teams[3] = a;
	              secondSwaps++;
			  }
             if(streak >= maxStreak)
             {
            	 if(streak == maxStreak)
            	 {
            		 bestPlayerA.add(teams[0]);
            		 bestPlayerB.add(teams[2]);         		 
            	 }
            	 else
            	 {
            		 maxStreak = streak;
            		 bestPlayerA.clear();
            		 bestPlayerB.clear();
            		 bestPlayerA.add(teams[0]);
            		 bestPlayerB.add(teams[2]);           		 
            	 }
             }
		 }
		 else
		 { 
	    if(firstSwaps%2 == 0)
		  {
		  String a = line.poll();
		  String b = teams[2];
		  String c = teams[0];
		  line.add(b);
          teams[2] = a;
         firstSwaps++;
		  }
		  else
		  {
			  String a = line.poll();
			  String b = teams[0];
			  line.add(b);
			  swapOne(teams);
			  teams[2] = a;
              firstSwaps++;
		  }
			  if(streak >= maxStreak)
	             {
	            	 if(streak == maxStreak)
	            	 {
	            		 bestPlayerA.add(teams[1]);
	            		 bestPlayerB.add(teams[3]);         		 
	            	 }
	            	 else
	            	 {
	            		 maxStreak = streak;
	            		 bestPlayerA.clear();
	            		 bestPlayerB.clear();
	            		 bestPlayerA.add(teams[1]);
	            		 bestPlayerB.add(teams[3]);           		 
	            	 }
	             }
		 }	 	 
	 }
	 for(int i = 0; i<bestPlayerA.size();i++)
	 {
		 System.out.println(bestPlayerA.get(i) + " " + bestPlayerB.get(i));
	 }
}
}
