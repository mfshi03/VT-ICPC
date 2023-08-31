package icpc;
import java.io.*;
import java.util.*;
public class CuttingTheNecklace {
 public static void main(String[]args) throws Exception{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer str = new StringTokenizer(br.readLine());
	 int k = Integer.parseInt(str.nextToken());
	 int n = Integer.parseInt(str.nextToken());
	 str = new StringTokenizer(br.readLine());
	 int sum = 0; 
	 int[]beads = new int[n];
	 for(int i = 0; i < n; i++)
	 {
		 beads[i] = Integer.parseInt(str.nextToken());
		 sum += beads[i];
	 }
	 long target = sum/k;
     long[] mods = new long[n];
     HashMap<Long, Integer> cnts = new HashMap<>();
     for(int i = 0; i < n; i++) {
         if (i > 0) mods[i] = mods[i-1];
         mods[i] = (mods[i] + beads[i]) % target;
         Integer test = cnts.get(mods[i]);
         if (test == null) cnts.put(mods[i], 1);
         else cnts.put(mods[i], test+1);
     }
     for(long val: cnts.keySet()) {
         if (cnts.get(val) == k) {
             System.out.println("YES");
             return;
         }
     }
     System.out.println("NO");
 
 
 
 }
}
