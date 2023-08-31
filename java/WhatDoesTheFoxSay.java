package icpc;
import java.io.*;
import java.util.*;

public class WhatDoesTheFoxSay {

public static String solve(String sounds, Set<String> animals) {
    StringBuilder res = new StringBuilder();
    boolean first = true;
    for (String sound : sounds.split(" ")) {
        if (!animals.contains(sound)) {
            if (first)
                first = false;
            else
                res.append(" ");
            res.append(sound);
        }
    }
    return res.toString();
}

public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    int z = Integer.parseInt(reader.readLine());
    while (z-- > 0) {
        String sounds = reader.readLine();
        HashSet<String> animals = new HashSet<String>();
        while (true) {
            String sound = reader.readLine();
            if (sound.equals("what does the fox say?")) {
                System.out.println(solve(sounds, animals));
                break;
            } else {
                animals.add(sound.split(" ")[2]);
            }
        }
    }
}

}
