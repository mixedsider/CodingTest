import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int m = Integer.parseInt(input[0]);
    int n = Integer.parseInt(input[1]);

    for( int i = m; i <= n; i++ ) { // m ~ n 사이
      boolean flag = true;
      if( i == 1 ) continue;
      for( int j = 2; j <= Math.sqrt(i); j++ ) { // 소수 구하기
        if( i % j == 0 ) {
          flag = false;
          break;
        }
      }

      if( flag ) { // 소수라면 출력
        System.out.println(i);
      }
    }
  }
}