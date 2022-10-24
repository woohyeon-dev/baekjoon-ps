import java.io.*;

public class Main {
  static int startX, startY, prevX, prevY, currentX, currentY, distanceX, distanceY;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[][] check = new boolean[6][6];
    boolean possible = true;
    String prevSquare = br.readLine();
    startX = '6' - prevSquare.charAt(1); // 시작지점 x좌표
    startY = prevSquare.charAt(0) - 'A'; // 시작지점 y좌표
    prevX = startX;
    prevY = startY;
    check[prevX][prevY] = true;

    for (int i = 0; i < 35; i++) {
      String currentSquare = br.readLine();
      currentX = '6' - currentSquare.charAt(1);
      currentY = currentSquare.charAt(0) - 'A';

      // 이전에 방문한 적이 있으면 Invalid 출력 후 종료
      if (check[currentX][currentY] == true) {
        possible = false;
      }

      // 이동 가능한 위치인지 확인 아닐 시 Invalid 출력 후 종료
      distanceX = Math.abs(currentX - prevX);
      distanceY = Math.abs(currentY - prevY);
      if (!(distanceX == 1 && distanceY == 2 || distanceX == 2 && distanceY == 1)) {
        possible = false;
      }

      check[currentX][currentY] = true;
      prevX = currentX;
      prevY = currentY;
    }

    distanceX = Math.abs(startX - currentX);
    distanceY = Math.abs(startY - currentY);
    if (!possible || !(distanceX == 1 && distanceY == 2 || distanceX == 2 && distanceY == 1)) {
      System.out.println("Invalid");
      return;
    }
    System.out.println("Valid");
  }
}