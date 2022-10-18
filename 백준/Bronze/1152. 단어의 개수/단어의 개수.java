import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

    int cnt = 0;
    int pre_str = 32; // 공백을 의미
    int str;

    while (true) {
      str = System.in.read();

      // 입력받은 문자가 공백일 때,
      if (str == 32) {
        // 이전의 문자가 공백이 아니면
        if (pre_str != 32)
          cnt++;
      }
      // 입력받은 문자가 \n 일때
      else if (str == 10) {
        // 이전의 문자가 공백이 아니면
        if (pre_str != 32)
          cnt++;
        break;
      }

      pre_str = str;
    }

    System.out.println(cnt);
  }
}