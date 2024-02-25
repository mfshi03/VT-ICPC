package icpc;

import java.io.*;
import java.util.*;

public class ChocolateChipFabrication {

  static class Point {

    int x, y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer str = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(str.nextToken());
    int m = Integer.parseInt(str.nextToken());

    char[][] padded = new char[n + 2][m + 2];
    for (char[] row : padded) {
      Arrays.fill(row, '-');
    }

    for (int i = 1; i <= n; i++) {
      String line = br.readLine();
      for (int j = 1; j <= m; j++) {
        padded[i][j] = line.charAt(j - 1);
      }
    }

    int[][] dp = new int[n + 2][m + 2];
    for (int[] row : dp) {
      Arrays.fill(row, Integer.MAX_VALUE);
    }

    Queue<Point> queue = new LinkedList<>();
    for (int i = 0; i < n + 2; i++) {
      for (int j = 0; j < m + 2; j++) {
        if (padded[i][j] == '-') {
          dp[i][j] = 0;
          queue.add(new Point(i, j));
        }
      }
    }

    int cycles = 0;

    while (!queue.isEmpty()) {
      Point node = queue.poll();
      int i = node.x;
      int j = node.y;

      if (i - 1 >= 0 && dp[i - 1][j] == Integer.MAX_VALUE) {
        dp[i - 1][j] = dp[i][j] + 1;
        queue.add(new Point(i - 1, j));
      }

      if (j - 1 >= 0 && dp[i][j - 1] == Integer.MAX_VALUE) {
        dp[i][j - 1] = dp[i][j] + 1;
        queue.add(new Point(i, j - 1));
      }

      if (i + 1 < n + 2 && dp[i + 1][j] == Integer.MAX_VALUE) {
        dp[i + 1][j] = dp[i][j] + 1;
        queue.add(new Point(i + 1, j));
      }

      if (j + 1 < m + 2 && dp[i][j + 1] == Integer.MAX_VALUE) {
        dp[i][j + 1] = dp[i][j] + 1;
        queue.add(new Point(i, j + 1));
      }

      if (dp[i][j] > cycles) {
        cycles = dp[i][j];
      }
    }

    System.out.println(cycles);
  }
}
