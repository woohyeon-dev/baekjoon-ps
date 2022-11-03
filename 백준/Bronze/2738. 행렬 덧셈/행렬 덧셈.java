import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n][m];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < n; j++) {
        st = new StringTokenizer(br.readLine());
        for (int k = 0; k < m; k++) {
          arr[j][k] += Integer.parseInt(st.nextToken());
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        sb.append(arr[i][j] + " ");
      }
      sb.deleteCharAt(sb.length() - 1);
      sb.append("\n");
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb);
  }
}