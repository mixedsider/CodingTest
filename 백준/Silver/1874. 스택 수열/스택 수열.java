import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    Stack<Integer> stack = new Stack<>();

    int n = Integer.parseInt(br.readLine()); // 몇개의 숫자가 나올 것인지
    int[] numbers = new int[n]; // 총 입력될 숫자

    for(int i = 0; i < n; i++) { // 숫자들 입력
      numbers[i] = Integer.parseInt(br.readLine());
    }

    int index = 0;
    int useNumber = 1;
    while( index != n ) {
      for( ; useNumber <= numbers[index];  useNumber++ ) {
        stack.push(useNumber);
        sb.append("+").append("\n");
      }

      if( !stack.isEmpty() && stack.peek() == numbers[index] ) {
        stack.pop();
        sb.append("-").append("\n");
        index++;
      }

      if( !stack.isEmpty() && stack.peek() > numbers[index] ) {
        System.out.println("NO");
        return;
      }
    }
    sb.setLength(sb.length()-1);
    System.out.println(sb);
  }
}