import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] str = new String[3];

    for (int i = 0; i < str.length; i++) {
      str[i] = sc.nextLine();
    }

    int isNum = Integer.MAX_VALUE;

    for(int i = 0; i < str.length; i++) {
      try {
        int num = Integer.parseInt(str[i]);
        isNum = Math.min(i, isNum);
      } catch (Exception e) {
        continue;
      }
    }
    String next = next(Integer.parseInt(str[isNum]) + (3 - isNum));

    System.out.println(next);
  }

  public static String next(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(num);
  }
}
