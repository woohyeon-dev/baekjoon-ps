import java.io.*;

public class Main {
  static int INF = 100000000;
  static int n; // 사람의 수
  static int[][] friends;
  static int max; // 2- 친구가 가장 많은 사람의 2-친구 수

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    friends = new int[n][n];
    max = 0;

    for (int i = 0; i < n; i++) {
      char[] c = br.readLine().toCharArray();
      for (int j = 0; j < n; j++) {
        if (c[j] == 'Y') {
          friends[i][j] = 1;
        } else if (i != j) {
          friends[i][j] = INF;
        }
      }
    }

    floydWarshall();

    for (int i = 0; i < n; i++) {
      int cnt = 0;
      for (int j = 0; j < n; j++) {
        // 2- 친구인 경우
        if (i != j && friends[i][j] <= 2) {
          cnt++;
        }
      }
      if (max < cnt) {
        max = cnt;
      }
    }

    System.out.println(max);
  }

  // Floyd Warshall 알고리즘
  public static void floydWarshall() {
    for (int k = 0; k < n; k++) { // k는 거쳐가는 노드
      for (int i = 0; i < n; i++) { // i는 출발 노드
        for (int j = 0; j < n; j++) { // j는 도착 노드
          if (k == i || i == j || j == k) {
            continue;
          }
          if (friends[i][j] > friends[i][k] + friends[k][j]) {
            friends[i][j] = friends[i][k] + friends[k][j];
          }
        }
      }
    }
  }
}
