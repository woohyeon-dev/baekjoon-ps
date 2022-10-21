import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0; // 그룹 단어 개수
    for (int i = 0; i < N; i++) {
      boolean[] check = new boolean[26]; // 알파벳 사용 내역
      String word = br.readLine(); // 단어 입력 받음
      int wordLength = word.length();
      int prev = 0; // 이전 알파벳
      int j = 0;
      for (; j < wordLength; j++) {
        int current = word.charAt(j) - 97; // ASCII 코드 97은 a
        // 이전에 사용한 적이 있는 알파벳이라면
        if (check[current]) {
          // 연속된 알파벳이 아니라면 break
          if (prev != current) {
            break;
          }
        } else { // 이전에 사용한 적이 없는 알파벳이라면
          check[current] = true;
          prev = current;
        }
      }
      // j가 wordLength와 같으면 그룹 단어
      if (j == wordLength) {
        count++;
      }
    }
    System.out.println(count);
  }
}