import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(Integer.parseInt(st.nextToken()));
    list.add(Integer.parseInt(st.nextToken()));
    list.add(Integer.parseInt(st.nextToken()) - list.get(0));
    list.add(Integer.parseInt(st.nextToken()) - list.get(1));
    System.out.println(Collections.min(list));
  }
}
