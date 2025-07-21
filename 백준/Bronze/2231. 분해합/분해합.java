import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for( int i = 1; i <= num; i++ ) {
      String[] numStr = String.valueOf(i).split("");

      int result = 0;

      for( int j = 0; j < numStr.length; j++ ) {

        result += Integer.parseInt(numStr[j]);

      }

      if( result + i == num ) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(0);
  }
}
