import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[5]; // 입력값들을 저장할 배열

    // 배열에 입력값 저장후 정렬
    for (int i = 0; i < 5; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    int num = arr[0]; // 결과값을 저장할 변수
    int count = 0; // 나누어 떨어지는 입력값 개수를 담을 변수

    while (true) {
      // num 값을 나눴을때 입력값들이 나누어 떨어지면 count++
      for (int i = 0; i < 5; i++) {
        if (num % arr[i] == 0) {
          count++;
        }
      }
      // 3개 이상 나눠지면 반복문 종료
      if (count > 2) {
        break;
      }
      // 3개 이상 나눠지지 않았으면 count 초기화, num++
      count = 0;
      num++;
    }

    System.out.println(num);
  }
}