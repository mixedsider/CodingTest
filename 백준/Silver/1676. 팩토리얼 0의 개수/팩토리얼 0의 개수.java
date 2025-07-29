import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    BigInteger num = BigInteger.ONE;

    for (int i = n; i > 1; i--) {
      num = num.multiply(BigInteger.valueOf(i));
    }

    String str = num.toString();
    int count = 0;
    for( int i = 0; i < str.length(); i++ ) {
      if( str.charAt(str.length() - i - 1) != '0' ) {
        break;
      }
      count++;
    }

    System.out.println(count);
  }
}
