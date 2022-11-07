import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String n = br.readLine();
      if (n.equals("0")) { // n이 0이면 종료
        return;
      }
      int width = n.length() + 1; // 초기값에 여백 길이를 넣음

      for (int i = 0; i < n.length(); i++) {
        if (n.charAt(i) == '1') {
          width += 2;
        } else if (n.charAt(i) == '0') {
          width += 4;
        } else {
          width += 3;
        }
      }
      System.out.println(width);
    }
  }
}