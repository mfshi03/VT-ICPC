package icpc;
import java.io.*;
import java.util.*;
public class PlayingTheSlots {
//(a.h+b.k+c)/√(a^2 +b^2)
 public static double area(double x1, double x2, double x3, double y1, double y2, double y3)
 {
	return (0.5)*Math.abs(((x1*(y2-y3))+(x2*(y3-y1))+ (x3*(y1-y2))));
 }

	
public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	double[]x = new double[N];
	double[]y = new double[N];
	for(int i = 0; i < N; i++)
	{
		StringTokenizer str = new StringTokenizer(br.readLine());
		x[i] = Double.parseDouble(str.nextToken());
		y[i] = Double.parseDouble(str.nextToken());
	}
	double max = 0;
	for(int j = 0; j < N; j++)
	{
		if(x[0] == x[j] && y[0] == y[j])
			continue;
		if(y[N-1] == y[j] && x[N-1] == x[j])
			continue;
       double altitude = (2*area(x[0],x[N-1],x[j],y[0],y[N-1],y[j]))/(Math.sqrt(Math.pow(x[0]-x[N-1],2) + Math.pow(y[0]-y[N-1], 2)));
       max = Math.max(max, altitude);
	}
	double a = max;
	double min = a; 
	for(int i = 0; i < N-1; i++)
	{
		 max = 0;
		for(int j = 0; j < N; j++)
		{
			if(i == j || i+1 == j)
				continue;
	       double altitude = (2*area(x[i],x[i+1],x[j],y[i],y[i+1],y[j]))/(Math.sqrt(Math.pow(x[i]-x[i+1],2) + Math.pow(y[i]-y[i+1], 2)));
	       max = Math.max(max, altitude);
		}
		//if(max == 0)
		//	continue;
		min = Math.min(max, min);
	}

	System.out.println(min);
}
}
