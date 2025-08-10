import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    if( n % 5 == 0 ) {
      System.out.println(n / 5);
      return;
    }

    for( int i = n / 5; i >= 0; i-- ) {

      for( int j = 1; j < n; j++ ) {

        int sum = (i * 5) + (3 * j);
        if( sum == n ) {
          System.out.println(i + j);
          return;
        }
      }
    }

    System.out.println(-1);

  }
}
