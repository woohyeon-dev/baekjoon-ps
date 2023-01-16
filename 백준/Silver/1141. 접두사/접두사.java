import java.io.*;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    HashSet<String> set = new HashSet<String>();
    for (int i = 0; i < n; i++) {
      set.add(br.readLine());
    }
    String[] arr = set.toArray(new String[0]);
    int cnt = n - arr.length;
    for (int i = 0; i < set.size(); i++) {
      for (int j = 0; j < set.size(); j++) {
        if (i != j && arr[i].length() <= arr[j].length()) {
          if (arr[i].equals(arr[j].substring(0, arr[i].length()))) {
            cnt++;
            break;
          }
        }
      }
    }
    System.out.println(n - cnt);
  }
}