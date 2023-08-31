package icpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class IntegerDivision {
	
  public static long nCr(long n) {
        return ((n*(n-1))/2);
    }
 public static void main(String[]args) throws Exception
 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer str = new StringTokenizer(br.readLine());
	 long a = Long.parseLong(str.nextToken());
	 long d = Long.parseLong(str.nextToken());
	 HashMap<Long,Long> map = new HashMap();
	 str = new StringTokenizer(br.readLine());
	 for(long i = 0; i < a; i++)
	 {
		 long nums = Long.parseLong(str.nextToken());
		 long divide = nums/d;
		 if(!map.containsKey(divide))
		 {
			 map.put(divide,(long)1);
		 }
		 else
		 {
			 map.put(divide, map.get(divide) + 1);
		 }
	 }
	long sum = 0; 
	Iterator<Map.Entry<Long, Long>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        Entry<Long, Long> entry = iterator.next();
        sum += nCr(entry.getValue());
    }
	System.out.println(sum);
     
 }
}
