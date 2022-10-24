import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  static int startX, startY, prevX, prevY, currentX, currentY, distanceX, distanceY;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    Integer[] B = new Integer[N];
    // 배열 A값 입력
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    // 배열 B값 입력
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(A); // 배열A 오름차순으로 정렬
    Arrays.sort(B, Comparator.reverseOrder()); // 배열B 내림차순으로 정렬

    // A[0] × B[0] + ... + A[N-1] × B[N-1] 출력
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += A[i] * B[i];
    }
    System.out.println(sum);
  }
}