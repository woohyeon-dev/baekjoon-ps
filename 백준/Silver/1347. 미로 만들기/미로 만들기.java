import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    String path = br.readLine();
    char arr[][] = new char[101][101];
    for (int i = 0; i < 101; i++) {
      for (int j = 0; j < 101; j++)
        arr[i][j] = '#';
    }
    int nowX, nowY, minY, minX, maxY, maxX;
    nowX = nowY = minY = minX = maxX = maxY = 50;
    arr[50][50] = '.';
    int dir = 0; // 0 남, 1 서, 2 북, 3 동

    for (int i = 0; i < n; i++) {
      char current = path.charAt(i);
      if (current == 'F') {
        if (dir == 0) {
          nowY++;
          if (maxY < nowY) {
            maxY = nowY;
          }
        } else if (dir == 1) {
          nowX--;
          if (minX > nowX) {
            minX = nowX;
          }
        } else if (dir == 2) {
          nowY--;
          if (minY > nowY) {
            minY = nowY;
          }
        } else if (dir == 3) {
          nowX++;
          if (maxX < nowX) {
            maxX = nowX;
          }
        }
        arr[nowY][nowX] = '.';
      } else if (current == 'L') {
        dir = (dir + 3) % 4;
      } else if (current == 'R') {
        dir = (dir + 1) % 4;
      }
    }

    for (int j = minY; j <= maxY; j++) {
      for (int i = minX; i <= maxX; i++) {
        sb.append(arr[j][i]);
      }
      sb.append('\n');
    }
    System.out.println(sb);
  }
}
