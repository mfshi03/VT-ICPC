package icpc;
import java.io.*;
import java.util.*;
public class SecretSanta{
	public static void main(String[]args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

		
        double prob = 0;
        double fact = 1.0;
		double val = 1.0;

        for (double i = 0; i <= n; i++) {
            if (i > 0) {
                fact *= i;
            }

			val = Math.pow(1, i) / fact;
			if(Math.abs(val) < 1e-15)
			{
				break;
			}
            prob += val;
        }

        System.out.println(1.0 - prob);
	}
}