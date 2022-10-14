import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int start = Integer.parseInt(st.nextToken());
    int end = Integer.parseInt(st.nextToken());
    int add = 1; // 수열을 만들 때 더할 값
    int num = add; // 수열을 만들 때 더할 값의 남은 개수
    int sum = 0; // 시작 지점부터 끝 지점까지의 수열의 합을 저장할 변수

    for (int i = 1; i <= end; i++) {
      // 더할 값의 남은 개수가 0일 때
      if (num == 0) {
        add++;
        num = add;
      }
      // i값이 시작 지점보다 크면 sum에 add를 더한다.
      if (i >= start) {
        sum += add;
      }
      // 더할 값의 남은 개수--
      num--;
    }

    System.out.println(sum);
  }
}