import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    while(true) {
      String str = sc.nextLine();
      if( str.equals("0")) {
        break;
      }

      for( int i = 0; i < str.length()/2; i++ ) {
        if( str.charAt(i) != str.charAt(str.length()-i-1)) {
          flag = false;
        }
      }
      if( flag ) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
      flag = true;
    }
  }
}
