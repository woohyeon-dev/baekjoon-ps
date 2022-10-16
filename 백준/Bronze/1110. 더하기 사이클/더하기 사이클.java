import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int num = n;
    int count = 0;
    do {
      count++;
      num = num % 10 * 10 + (num / 10 + num % 10) % 10;
    } while (n != num);
    System.out.println(count);
  }
}