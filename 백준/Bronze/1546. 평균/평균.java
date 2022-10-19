import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    double M = 0; // 최대값
    int[] scores = new int[N]; // 점수들을 저장할 배열
    double total = 0; // 총합

    // 입력받은 점수 중에 최대값 구하기
    for (int i = 0; i < N; i++) {
      scores[i] = Integer.parseInt(st.nextToken());
      if (M < scores[i]) {
        M = scores[i];
      }
    }

    // 점수/M*100로 고친 성적의 총합 구하기
    for (int i = 0; i < N; i++) {
      total += scores[i] / M * 100;
    }

    // 점수/M*100로 고친 성적의 평균 출력하기
    System.out.println(total / N);
  }
}