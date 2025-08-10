import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for( int i = 0; i < n; i++ ) {
      String input = br.readLine();
      Stack<Character> stack = new Stack<>();
      boolean flag = true;

      for (char c : input.toCharArray()) {
        if (c == '(') {
          stack.push(c);
        } else if (c == ')') {
          if (stack.isEmpty() || stack.pop() != '(') {
            flag = false;
            break;
          }
        }
      }

      if (flag && stack.isEmpty()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}