package icpc;
import java.io.*;
import java.util.*;
public class MrCodeFormatGrader {
public static void main(String[]args)throws Exception
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(str.nextToken());
    int e = Integer.parseInt(str.nextToken());
    HashMap<Integer, Integer>map = new HashMap<Integer,Integer>();
    str = new StringTokenizer(br.readLine());
    for(int i = 0; i < e; i++)
    {
        map.put(Integer.parseInt(str.nextToken()),i);
    }
    Deque<String>errors = new LinkedList<String>();
    Deque<String>correct = new LinkedList<String>();
    int lastError = -1; 
    int lastCorrect = -1;
    boolean firstE = true;
    boolean firstC = true;
    boolean cont = false;
    for(int i = 1; i <= n; i++)
    {
        if(map.containsKey(i))
        {
           if(lastError == i-1)
           {
              if(firstE)
              {
              String s = errors.pollLast(); 
              s += "-";
              errors.addLast(s);
              firstE = false;
              }
              lastError = i; 
              continue;
           }
           if(lastCorrect!= -1 && !correct.isEmpty())
           {
              String s = correct.pollLast();
              s += String.valueOf(lastCorrect);
              correct.addLast(s);
              lastCorrect = -1; 
              firstC = true;
           }
           
           errors.addFirst(String.valueOf(i));
           lastError = i;
           if(lastError!= -1 && i == n)
           {
              String s = errors.pollLast();
              s += String.valueOf(lastError);
              errors.addLast(s);
              lastError = -1; 
           }
           
        }
        else
        {
            if(lastError!= -1 &&!errors.isEmpty())
            {
               String s = errors.pollLast();
               s += String.valueOf(lastError);
               errors.addLast(s);
               lastError = -1; 
               firstE = true;
            }
            if(lastCorrect == i-1)
            {
               if(firstC)
               {
               String s = correct.pollLast(); 
               s += "-";
               correct.addLast(s);
               firstC = false;
               }
               lastCorrect = i; 
               continue;
            }
            correct.addLast(String.valueOf(i));
            lastCorrect = i;
            if(lastCorrect!= -1&&i==n)
            {
               String s = correct.pollLast();
               s += String.valueOf(lastCorrect);
               errors.addLast(s);
               lastCorrect = -1; 
            }
        }
            
    }
    System.out.println("Errors: ");
    while(!errors.isEmpty())
    {
        if(errors.size() == 2)
        {
            System.out.print(errors.pollFirst() + " and ");
            continue;
        }
        if(errors.size() == 1)
        {
           System.out.print(errors.pollFirst());
           continue;
        }
        System.out.print(errors.pollLast() + ", ");
    }
    System.out.println();
    System.out.print("Correct: ");
    while(!correct.isEmpty())
    {
        if(correct.size() == 2)
        {
            System.out.print(correct.pollFirst() + " and ");
            continue;
        }
        if(correct.size() == 1)
        {
           System.out.print(correct.pollFirst());
           continue;
        }
        System.out.print(correct.pollLast() + ", ");
    }
    
    
    
}
}
