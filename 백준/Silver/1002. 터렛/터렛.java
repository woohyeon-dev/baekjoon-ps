import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int r1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());

      double distancePow = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
      double diffPow = Math.pow(r1 + r2, 2);
      double sumPow = Math.pow(r1 - r2, 2);

      // 중점이 같으면서 반지름도 같은 경우
      if (x1 == x2 && y1 == y2 && r1 == r2) {
        sb.append(-1);
      }
      // 두 원의 반지름 합보다 중점간 거리가 더 긴 경우 혹은 원 안에 원이 있으나 내접하지 않는 경우
      else if (distancePow > diffPow || distancePow < sumPow) {
        sb.append(0);
      }
      // 내접하는 경우 혹은 외접하는 경우
      else if (distancePow == diffPow || distancePow == sumPow) {
        sb.append(1);
      }
      // 나머지 모든 경우
      else {
        sb.append(2);
      }

      // i가 마지막이 아닐 때만 개행 문자 추가
      if (i != t - 1) {
        sb.append("\n");
      }
    }
      
    // 출력
    System.out.println(sb);
  }
}
