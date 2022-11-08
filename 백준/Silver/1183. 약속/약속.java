import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
    }
    // 정렬한 배열의 중간값이 최소
    Arrays.sort(arr);
    if (n % 2 == 1) { // n이 홀수라면 중간 값은 하나이므로 1을 출력
      System.out.println(1);
    } else { // n이 짝수라면 |arr[n/2] - arr[n/2-1]| + 1
      System.out.println(Math.abs(arr[n / 2] - arr[n / 2 - 1]) + 1);
    }
  }
}
