import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    if( input.isBlank() ) {
      System.out.println(0);
      return;
    }

    System.out.println(input.trim().split(" ").length);
  }
}
