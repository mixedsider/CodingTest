import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long x = sc.nextInt();
    long y = sc.nextInt();

    Long result = (x + y) * (x - y);

    System.out.println(result);
  }
}
