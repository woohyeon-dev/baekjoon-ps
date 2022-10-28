import java.io.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BigInteger zero = new BigInteger("0");

    for (int i = 0; i < 3; i++) {
      int n = Integer.parseInt(br.readLine());
      BigInteger sum = zero;
      for (int j = 0; j < n; j++) {
        sum = sum.add(new BigInteger(br.readLine()));
      }
      if (sum.compareTo(zero) == 0) {
        System.out.println(0);
      } else if (sum.compareTo(zero) == 1) {
        System.out.println("+");
      } else if (sum.compareTo(zero) == -1) {
        System.out.println("-");
      }
    }
  }
}
