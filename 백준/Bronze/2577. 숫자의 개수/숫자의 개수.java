import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int multiple = A * B * C;
    int[] result = new int[10];

    for( String a : String.valueOf(multiple).split("") ) {
      result[Integer.parseInt(a)]++;
    }

    for( int i = 0; i < 10; i++ ) {
      System.out.println( result[i] );
    }
  }
}
