import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new ArrayList<>();

    int n = Integer.parseInt(br.readLine());
    if( n == 0 ) {
      System.out.println(0);
      return;
    }

    int cutNum = (int) Math.round(n * 0.15);
    for( int i = 0; i < n; i++ ) {
      list.add(Integer.parseInt(br.readLine()));
    }

    Collections.sort(list);

    double sum = 0;
    for( int i = cutNum; i < n - cutNum; i++ ) {
      sum += list.get(i);
    }

    System.out.println(Math.round(sum / (n - 2 * cutNum)));
  }
}