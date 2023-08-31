package icpc;
import java.util.*;

public class Arcade{
	public static void main(String[]args)
	{
		 Scanner input = new Scanner(System.in);
		 StringTokenizer str = new StringTokenizer(input.nextLine());
		 int n = Integer.parseInt(str.nextToken()); 
		 int p = Integer.parseInt(str.nextToken()); 
		 int m = Integer.parseInt(str.nextToken());
		 HashMap<String, Integer>map = new HashMap();
		 for(int i = 0; i < n; i++)
		 {
			 map.put(input.nextLine(),0);
		 }
		 boolean winner = false;
		 ArrayList<String>winners = new ArrayList<String>();
		 for(int j = 0; j < m ; j++)
		 {
			 str = new StringTokenizer(input.nextLine());
			 String s = str.nextToken();
			 int val = Integer.parseInt(str.nextToken());
			 int in = map.get(s);
			 map.put(s, in + val);
			 if(map.get(s) >= p &&(!winners.contains(s)))
			 {
				 System.out.println(s + " wins!");
				 winners.add(s);
				 winner = true;
			 }
			 
		 }
		 if(winner == false)
		 {
			 System.out.print("No winner!");
		 }
		 input.close();
		
	}
}
