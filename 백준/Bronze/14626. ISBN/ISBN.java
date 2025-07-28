import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] ISBN = sc.nextLine().split("");

    int sum = 0;
    int star = 0;
    for( int i = 0; i < ISBN.length; i++ ) {
      if( ISBN[i].equals("*")) {
        star = i;
        continue;
      }
      sum += i % 2 == 0 ?
          Integer.parseInt(ISBN[i]) :
          Integer.parseInt(ISBN[i])*3;
    }


    int result = sum % 10;
    if(result % 10 == 0) {
      System.out.println(0);
      return;
    }

    if( star % 2 == 0) {
      System.out.println( 10 - result );
    } else {
      System.out.println( result * 3 % 10);
    }

  }
}
