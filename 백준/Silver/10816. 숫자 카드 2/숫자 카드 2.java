import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> nums = new ArrayList<>();
    String buffer = "";


    int n = Integer.parseInt(br.readLine());
    buffer = br.readLine();
    for( String s : buffer.split(" ") ) {
      int i = Integer.parseInt(s);
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    int m = Integer.parseInt(br.readLine());
    buffer = br.readLine();
    for( String s : buffer.split(" ") ) {
      nums.add(Integer.parseInt(s));
    }

    for( int i = 0; i < nums.size(); i++ ) {
      sb.append(map.getOrDefault(nums.get(i), 0) + " ");
    }

    System.out.println(sb.toString());
  }
}