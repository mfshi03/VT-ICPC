package icpc;
import java.io.*;
import java.util.*;
public class BinaryWatch
{
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split("");
        
        String[][] chars = new String[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int z = 0; z < 4; z++) {
                chars[i][z] = ".";
            }
        }
        
       
        /** First digit **/
        switch (input[0]) {
            case "1": 
                chars[3][0] = "*";
                break;
            case "2":
                chars[2][0] = "*";
                break;
            case "3":
                chars[2][0] = "*";
                chars [3][0] = "*";
                break;
            case "4":
                chars[1][0] = "*";
                break;
            case "5": 
                chars[1][0] = "*";
                chars[3][0] = "*";
                break;
            case "6":
                chars[1][0] = "*";
                chars[2][0] = "*";
                break;
            case "7":
                chars[1][0] = "*";
                chars[2][0] = "*";
                chars[3][0] = "*";
                break;
            case "8":
                chars[0][0] = "*";
                break;
            case "9":
                chars[0][0] = "*";
                chars[3][0] = "*";
                break;
        }
        
        /** Second digit */
        
        switch (input[1]) {
            case "1": 
                chars[3][1] = "*";
                break;
            case "2":
                chars[2][1] = "*";
                break;
            case "3":
                chars[2][1] = "*";
                chars [3][1] = "*";
                break;
            case "4":
                chars[1][1] = "*";
                break;
            case "5": 
                chars[1][1] = "*";
                chars[3][1] = "*";
                break;
            case "6":
                chars[1][1] = "*";
                chars[2][1] = "*";
                break;
            case "7":
                chars[1][1] = "*";
                chars[2][1] = "*";
                chars[3][1] = "*";
                break;
            case "8":
                chars[0][1] = "*";
                break;
            case "9":
                chars[0][1] = "*";
                chars[3][1] = "*";
                break;
        }
        /** Third */
        
        switch (input[2]) {
            case "1": 
                chars[3][2] = "*";
                break;
            case "2":
                chars[2][2] = "*";
                break;
            case "3":
                chars[2][2] = "*";
                chars [3][2] = "*";
                break;
            case "4":
                chars[1][2] = "*";
                break;
            case "5": 
                chars[1][2] = "*";
                chars[3][2] = "*";
                break;
            case "6":
                chars[1][2] = "*";
                chars[2][2] = "*";
                break;
            case "7":
                chars[1][2] = "*";
                chars[2][2] = "*";
                chars[3][2] = "*";
                break;
            case "8":
                chars[0][2] = "*";
                break;
            case "9":
                chars[0][2] = "*";
                chars[3][2] = "*";
                break;
        }
        
        /** Fourth :*/
        
        switch (input[3]) {
            case "1": 
                chars[3][3] = "*";
                break;
            case "2":
                chars[2][3] = "*";
                break;
            case "3":
                chars[2][3] = "*";
                chars [3][3] = "*";
                break;
            case "4":
                chars[1][3] = "*";
                break;
            case "5": 
                chars[1][3] = "*";
                chars[3][3] = "*";
                break;
            case "6":
                chars[1][3] = "*";
                chars[2][3] = "*";
                break;
            case "7":
                chars[1][3] = "*";
                chars[2][3] = "*";
                chars[3][3] = "*";
                break;
            case "8":
                chars[0][3] = "*";
                break;
            case "9":
                chars[0][3] = "*";
                chars[3][3] = "*";
                break;
        }
        
        /** End*/
        for (int i = 0; i < 4; i++) {
            for (int z = 0; z < 4; z++) {
                System.out.print(chars[i][z]);
                if (z == 1) {
                    System.out.print("  ");
                }
                if (z != 3) {
                System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
    }
   
}
