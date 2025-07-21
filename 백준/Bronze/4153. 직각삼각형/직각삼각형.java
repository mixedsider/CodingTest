import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while ( true ) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if( a == 0 || b == 0 || c == 0) {
        break;
      }

      int aa = a * a;
      int bb = b * b;
      int cc = c * c;

      if (aa + bb == cc || aa + cc == bb || bb + cc == aa) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}
