import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;

    for (int i = 0; i < 8; i++) {
      String str = br.readLine();
      for (int j = i % 2; j < 8; j += 2) {
        if (str.charAt(j) == 'F') {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
