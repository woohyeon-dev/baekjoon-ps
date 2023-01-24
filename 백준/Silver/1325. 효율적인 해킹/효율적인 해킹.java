import java.io.*;
import java.util.*;

public class Main {
  static int n;
  static int m;
  static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
  static boolean[] visited;
  static int count;
  static int max = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    for (int i = 0; i <= n; i++) {
      list.add(new ArrayList<>());
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      list.get(b).add(a);
    }
    int[] result = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      visited = new boolean[n + 1];
      count = 0;
      bfs(i);
      result[i] = count;
      max = Math.max(count, max);
    }
    for (int i = 1; i <= n; i++) {
      if (result[i] == max) {
        System.out.print(i + " ");
      }
    }
  }

  public static void bfs(int x) {
    Queue<Integer> q = new LinkedList<>();
    q.add(x);
    visited[x] = true;
    while (!q.isEmpty()) {
      int v = q.poll();
      for (int i : list.get(v)) {
        if (!visited[i]) {
          q.add(i);
          visited[i] = true;
          count++;
        }
      }
    }
  }
}
