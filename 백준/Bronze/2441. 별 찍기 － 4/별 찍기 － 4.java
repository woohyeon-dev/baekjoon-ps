import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j >= i)
          sb.append('*');
        else
          sb.append(' ');
      }
      if (i != n - 1) {
        sb.append('\n');
      }
    }
    System.out.println(sb);
  }
}
