import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n - 1; j++) {
        sb.append(" ");
      }
      for (int j = 0; j < i * 2 + 1; j++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb);
  }
}
