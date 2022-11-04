import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());

    double low = 0;
    double high = Math.min(L, Math.min(W, H));
    double mid;

    // 10000번씩 2분할하면 low와 high의 차이가 굉장히 굉장히 작아짐
    // 결과적으로 high - low가 1e-10보다 작아짐
    // 그래서 low <= high && high - low > 1e-10은 불가능
    // high - low가 계속 1e-10보다 크게 유지할 수 있기 때문
    for (int i = 0; i < 10000; i++) {
      mid = (low + high) / 2; // 현재 탐색하려는 A의 길이를 설정
      if (((long) (L / mid)) * ((long) (W / mid)) * ((long) (H / mid)) >= N) { // 상자의 넣을 수 있다면
        low = mid;
      } else { // 상자에 넣을 수 없다면
        high = mid;
      }
    }
    System.out.println(low);
  }
}
