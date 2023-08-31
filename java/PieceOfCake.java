package icpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PieceOfCake {
 public static void main(String[]args) throws Exception
 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer str = new StringTokenizer(br.readLine());
	 int n = Integer.parseInt(str.nextToken());
	 int h = Integer.parseInt(str.nextToken());
	 int v = Integer.parseInt(str.nextToken());
	 int length = Math.max(n-h,h);
	 int width = Math.max(v,n-v);
	 System.out.println(length*width*4);
 }
}
