import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] str = new String[3];

    for (int i = 0; i < str.length; i++) {
      str[i] = sc.nextLine();
    }

    int numStart = -1;
    int numIndex = Integer.MAX_VALUE;

    for(int i = 0; i < str.length; i++) {
      try {
        numStart = Integer.parseInt(str[i]);
        numIndex = i;
        break;
      } catch (Exception e) {}
    }
    String next = next(numStart + (3 - numIndex));

    System.out.println(next);
  }

  public static String next(int num) {
    if (num % 15 == 0) {
      return "FizzBuzz";
    }
    if (num % 3 == 0) {
      return "Fizz";
    }
    if (num % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(num);
  }
}
