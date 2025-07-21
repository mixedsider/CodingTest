import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 0;

    for( int i = 0; i < n; i ++ ) {

      int num = sc.nextInt();

      if( isDecimal( num ) ) {
        count++;
      }

    }

    System.out.println( count );
  }


  public static boolean isDecimal(int num) {
    if( 1 >= num ) {
      return false;
    }

    for( int i = 2; i <= Math.sqrt(num); i++ ) {
      if( num % i == 0 ) {
        return false;
      }
    }
    return true;
  }
}
