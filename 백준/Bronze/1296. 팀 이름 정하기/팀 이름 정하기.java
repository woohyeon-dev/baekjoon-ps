import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();
    int count = Integer.parseInt(br.readLine()); // 팀 후보 개수
    int[][] arr = new int[count + 1][4]; // 이름과 팀이름의 L,O,V,E 개수를 저장할 2차원 배열 선언
    String[] love = { "L", "O", "V", "E" };

    // 이름에 L,O,V,E 개수를 arr 배열 첫번째 열에 각각 저장
    for (int i = 0; i < love.length; i++) {
      int nLen = name.length(); // 이름 길이
      arr[0][i] = nLen - name.replaceAll(love[i], "").length();
    }

    // 확률의 가장 작은 숫자 0과 팀 이름의 사전적으로 가장 마지막인 ZZZZZZZZZZZZZZZZZZZZ로 설정
    int max = 0;
    String result = "ZZZZZZZZZZZZZZZZZZZZ";

    for (int i = 1; i < arr.length; i++) {
      String tName = br.readLine();
      int tLen = tName.length();

      // 팀이름의 L,O,V,E 개수를 arr 배열에 저장
      for (int j = 0; j < 4; j++) {
        arr[i][j] = tLen - tName.replaceAll(love[j], "").length();
      }

      // 공식을 통해 확률 측정
      int total = sum(arr[0][0] + arr[i][0], arr[0][1] + arr[i][1], arr[0][2] + arr[i][2], arr[0][3] + arr[i][3]);

      // 현재 팀의 확률이 더 크면 갱신
      if (max < total) {
        max = total;
        result = tName;
      }
      // 현재 팀의 확률과 이전에 계산한 팀의 확률이 같으면
      else if (max == total) {
        // 사전순으로 앞서는 팀 찾기
        if (result.compareTo(tName) > 0) {
          result = tName;
        }
      }
    }

    System.out.println(result);
  }

  public static int sum(int l, int o, int v, int e) {
    return ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
  }
}