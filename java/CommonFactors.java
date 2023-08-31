package icpc;

import java.io.*;
import java.util.*;

public class CommonFactors {
    public static long[] primes = new long[] { 2, 3, 5, 7, 11, 13, 17, 19, 23,
        29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
        103, 107, 109 };

    public static long phi(long n)
    {
        // Initialize result as n
        long result = n;
     
        // Consider all prime factors
        // of n and subtract their
        // multiples from result
        for (long p = 2; p * p <= n; ++p)
        {
             
            // Check if p is
            // a prime factor.
            if (n % p == 0)
            {
                 
                // If yes, then update
                // n and result
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }
     
        // If n has a prime factor
        // greater than sqrt(n)
        // (There can be at-most
        // one such prime factor)
        if (n > 1)
            result -= result / n;
        return result;
    }


    public static long printSubsets(ArrayList<Long> prev, long p, long val) {
        int n = prev.size();
        long ret = 0;
        for (int i = 0; i < (1 << n); i++) {
            long add = 1;
            long count = 0;
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0) {
                    add *= prev.get(j);
                    count++;
                }
            if (count % 2 == 1) {
                ret -= p / (val * add);
            }
            else {
                ret += p / (val * add);
            }
        }
        return ret;

    }


    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    public static String asFraction(long a, long b) {
        long gcd = gcd(a, b);
        return (a / gcd) + "/" + (b / gcd);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(
            System.in));
        String s = br.readLine();
        long n = Long.parseLong(s);
        int k = 0;
        long p = primes[k];
        long p2 = primes[k + 1] * primes[k];
        if(s.length() >= 19)
        {
            k = 14;
            for(int i = 1; i <= 14; i++)
            {
                p*=primes[i];
            }
            
        }
        else
        {
        while(!(p <= n && n < p2))
        {
            k++;
            p*= primes[k];
            p2*=primes[k+1];
            if(k+1 == 15)
                break;
        }
        }
        /*
        ArrayList<Long> prev = new ArrayList<Long>();
        if (s.length() >= 19) {
            k = 14;
            for (int i = 1; i <= 14; i++) {
                p *= primes[i];
            }

        }
        else {
           
        }
        long count = 0;

        for (int i = 0; i <= k; i++) {
            long add = printSubsets(prev, p, primes[i]);
            count += add;
            prev.add(primes[i]);
        }
        */
        
        System.out.println(asFraction(p-phi(p), p));
    }

}

