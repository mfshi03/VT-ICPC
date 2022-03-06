package icpc;
import java.io.*;
import java.util.*;
public class Espresso {
    public static void main(String[]args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer s = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(s.nextToken());
    int st = Integer.parseInt(s.nextToken());
    int ounces = st;
    int ouncetest = ounces;
    int sum = 0; 
    int refill = 0;
    int f = 0;
    boolean first = true;
    int[]vals = new int[n];
    for(int i = 0; i < n; i++)
    {
        String str = br.readLine();
        int add = 0; 
        if(str.contains("L"))
        {
      
        add+=1;
        add += Integer.parseInt(str.substring(0,str.length()-1));        
        }
        else
        {
            add += Integer.parseInt(str);
        }
        vals[i] = add;
    }
    ounces -= vals[0];
    for(int i = 1; i < n; i++)
    {
        if(vals[i] > ounces)
        {
            //System.out.println(vals[i]);
            ounces = st - (vals[i]);
            refill++;
            continue;
        }
        if(vals[i] <= ounces)
        {
            ounces = ounces - vals[i];
            continue;
        }
    }
    System.out.println(refill);
}
}

    
