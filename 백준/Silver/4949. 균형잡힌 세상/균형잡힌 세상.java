import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String input = br.readLine();
      if (input.equals(".")) {
        break;
      }
      Stack<Character> stack = new Stack<>();
      boolean isBalanced = true;

      for (char c : input.toCharArray()) {
        if (c == '(' || c == '[') {
          stack.push(c);
        } else if (c == ')') {
          if (stack.isEmpty() || stack.pop() != '(') {
            isBalanced = false;
            break;
          }
        } else if (c == ']') {
          if (stack.isEmpty() || stack.pop() != '[') {
            isBalanced = false;
            break;
          }
        }
      }
      if (isBalanced && stack.isEmpty()) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}