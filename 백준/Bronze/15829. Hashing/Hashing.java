import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final int R = 31;
    final int M = 1234567891;
    Scanner sc = new Scanner(System.in);
    int result = 0;

    int length = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();

    for(int i = 0; i < length; i++) {
      char c = str.charAt(i);
      int change = c - 'a' + 1;
      result += (change * Math.pow(R, i));
    }

    System.out.println(result);

  }
}
