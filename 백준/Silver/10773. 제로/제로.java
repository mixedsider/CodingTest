import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    Stack<Integer> stack = new Stack<>();

    int n = sc.nextInt();
    for( int i = 0; i < n; i++ ) {
      int m = sc.nextInt();
      if( m == 0 ) {
        stack.pop();
      } else {
        stack.push(m);
      }
    }
    int sum = 0;
    for( int i : stack ) {
      sum += i;
    }
    System.out.println(sum);
  }
}