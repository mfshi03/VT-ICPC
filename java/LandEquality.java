package icpc;
import java.io.*;
import java.util.*;
public class LandEquality
{
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
        int numZeros = 0;
        int numTwos = 0;
        int numOnes = 0;
        String s = ""; 
        for(int i = 0 ; i < r; i++)
        {
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++)
            {
                String a = str.nextToken();
                 s += a;
                int n = Integer.parseInt(a);
                if(n == 0)
                    numZeros++;
                if(n == 1)
                    numOnes++;
                if(n == 2)
                    numTwos++;
            }
        }
        if(numZeros >= 2 )
        {
            System.out.println("0");
        }
        else
           if(numZeros == 1)
           {
               if(numTwos == 0)
                   System.out.println("1");
                       else
               if(numOnes == 0)
                   System.out.println("2");
               else
               {
               if(r == 1 || c == 1)
               {
                   if(s.substring(0,1).equals("1") || s.substring(s.length()-1).equals("1")) 
                   {
                           System.out.println("1");                 
                   }
                   else
                   {
                            System.out.println("2");
                   }
               }
               else
               {
                   System.out.println("1");
               }
               }
           }
           else
           {
                   if(numTwos%2 == 0)
                   {
                       System.out.println("0");
                   }
                   else
                   {
                   System.out.println((long)Math.pow(2, numTwos/2)); //use longs to prevent integer overflow
                   
                   }
           }
    }
}
