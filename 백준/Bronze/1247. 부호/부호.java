import java.io.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 3; i++) {
      int n = Integer.parseInt(br.readLine());
      BigInteger sum = BigInteger.ZERO;
      for (int j = 0; j < n; j++) {
        sum = sum.add(new BigInteger(br.readLine()));
      }
      // compareTo(0)이 -1이면 음수, 1이면 양수, 0이면 0
      if (sum.compareTo(BigInteger.ZERO) == 0) {
        System.out.println(0);
      } else if (sum.compareTo(BigInteger.ZERO) == 1) {
        System.out.println("+");
      } else if (sum.compareTo(BigInteger.ZERO) == -1) {
        System.out.println("-");
      }
    }
  }
}
