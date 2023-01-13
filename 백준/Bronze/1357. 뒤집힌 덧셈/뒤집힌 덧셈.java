import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    System.out.println(Rev(Rev(x) + Rev(y)));
  }

  private static int Rev(int n) {
    String str = "";
    while (n > 0) {
      str += n % 10;
      n = n / 10;
    }
    return Integer.parseInt(str);
  }
}
