import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> queue = new LinkedList<>();
    StringBuffer sb = new StringBuffer();

    String[] input = br.readLine().split(" ");

    int n = Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);

    for( int i = 1; i <= n; i++ ) {
      queue.addLast(i);
    }

    sb.append("<");

    while( !queue.isEmpty() ) {
      for( int i = 1; i <= k; i++ ) {
        if( i == k ) {
          sb.append(queue.poll()).append(", ");
          break;
        }
        queue.addLast(queue.poll());
      }
    }
    sb.delete(sb.length() - 2, sb.length());
    sb.append(">");

    System.out.println(sb);
  }
}