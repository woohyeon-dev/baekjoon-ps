import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int t = Integer.parseInt(br.readLine());
    int a, b;

    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());

      int num = a % 10;
      if (num == 0) {
        num = 10;
        b = 0;
      } else if (num == 1 || num == 5 || num == 6) { // 1주기 반복
        b = 0;
      } else if (num == 4 || num == 9) { // 2주기 반복
        b = b % 2;
        b = b != 0 ? b % 2 : 2;
      } else { // 4주기 반복
        b = b % 4;
        b = b != 0 ? b % 4 : 4;
      }
      for (int j = 1; j < b; j++) {
        num = (num * a) % 10;
      }
      sb.append(num);

      // 마지막은 개행 처리 x
      if (i != (t-1)) {
        sb.append('\n');
      }
    }
    System.out.println(sb);
  }
}
