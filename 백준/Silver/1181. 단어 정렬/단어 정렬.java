import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] arr = new String[N];

    // 문자열 입력받으면서 중복값 제거
    for (int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }

    // 정렬
    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        // 문자열 길이가 같을 때
        if (s1.length() - s2.length() == 0) {
          return s1.compareTo(s2);
        }
        // 문자열 길이가 다를 때
        else {
          return s1.length() - s2.length();
        }
      }
    });

    // 중복값 제외하고 출력
    StringBuilder sb = new StringBuilder();
    String prev = "";
    for (String v : arr) {
      if (!v.equals(prev)) { // 중복값이 아닐 경우
        sb.append(v).append('\n');
      }
      prev = v;
    }
    System.out.println(sb);
  }
}