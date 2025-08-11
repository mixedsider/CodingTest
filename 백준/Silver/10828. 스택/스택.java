import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static class StackClass {

    private Stack<Integer> stack = new Stack<>();

    public void push(int value) {
      this.stack.push(value);
    }
    public int pop() {
      if( this.stack.isEmpty() )
        return -1;
      return this.stack.pop();
    }
    public int size() {
      return this.stack.size();
    }
    public int empty() {
      return stack.isEmpty() ? 1 : 0;
    }
    public int top() {
      if( this.stack.isEmpty() )
        return -1;
      return stack.peek();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StackClass s = new StackClass();

    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      String[] command = sc.nextLine().split(" ");
      switch (command[0]) {
        case "push":
          s.push(Integer.parseInt(command[1]));
          break;
        case "pop":
          System.out.println(s.pop());
          break;
        case "size":
          System.out.println(s.size());
          break;
        case "empty":
          System.out.println(s.empty());
          break;
        case "top":
          System.out.println(s.top());
          break;
      }
    }
  }
}