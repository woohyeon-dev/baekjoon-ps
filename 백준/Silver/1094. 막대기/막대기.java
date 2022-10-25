import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int stick = 64;
    int count = 1; // 막대기 개수
    while (stick != x) {
      if (stick < x) {
        x -= stick;
        count++;
      } else {
        stick /= 2;
      }
    }
    System.out.println(count);
  }
}
