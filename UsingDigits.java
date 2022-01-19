package icpc;
import java.io.*;
import java.util.*;
public class UsingDigits {
    public static ArrayList<Integer>vals = new ArrayList<Integer>();
    public static void floodfill(int[][]graph, int x, int y, String[]steps, int index, int sum)
    {
        int min = Integer.MAX_VALUE;
        if(x >= graph.length || x < 0 || y >= graph[0].length|| y < 0 )
        {
            sum = 0;
            return;
        }
        if(x == graph.length-1 && y == graph[0].length-1)
        {
            vals.add(sum+graph[x][y]);
            return;
        }
      
        floodfill(graph,x,y+1,steps,index, sum + graph[x][y]);
        floodfill(graph,x+1,y,steps,index, sum  + graph[x][y]);
        if(index < steps.length)
        {
         int increment = Integer.parseInt(steps[index]);
         index++;
         floodfill(graph,x,y+1+increment,steps,index, sum + graph[x][y]);
         floodfill(graph,x+1+increment,y,steps,index, sum + graph[x][y]);
            
        }
     }
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(str.nextToken());
        int r = Integer.parseInt(str.nextToken());
       
        int[][]graph = new int[r][c];
        String[] key = br.readLine().split("");
        
        for(int i = 0; i < r; i++)
        {
            String[]s = br.readLine().trim().split("");
            for(int j = 0; j < c; j++)
            {
                graph[r-1-i][j] = Integer.parseInt(s[j]);
            }
        }
           floodfill(graph,0,0,key,0,0);
           System.out.println(Collections.min(vals));
        
    }

}
