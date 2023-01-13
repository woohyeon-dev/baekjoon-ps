import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      Map<String, Integer> map = new LinkedHashMap<String, Integer>();
      map.put("TTT", 0);
      map.put("TTH", 0);
      map.put("THT", 0);
      map.put("THH", 0);
      map.put("HTT", 0);
      map.put("HTH", 0);
      map.put("HHT", 0);
      map.put("HHH", 0);
      for (int j = 0; j < 38; j++) {
        String seq = str.substring(j, j + 3);
        map.put(seq, map.get(seq) + 1);
      }

      map.forEach((key, value) -> {
        sb.append(value + " ");
      });
      sb.replace(sb.length() - 1, sb.length(), "\n");
    }
    sb.delete(sb.length() - 1, sb.length());
    System.out.println(sb);
  }
}
