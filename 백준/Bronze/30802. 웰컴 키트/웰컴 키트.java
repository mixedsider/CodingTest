import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int resultT = 0;

    int N = sc.nextInt();

    int[] size = new int[6];

    for( int i = 0; i < size.length; i++ ) {
      size[i] = sc.nextInt();
    }

    int T = sc.nextInt();
    int P = sc.nextInt();

    for( int i = 0; i < size.length; i++ ) {
      resultT += calT(size[i], T);
    }

    System.out.println( resultT );
    System.out.println( N / P + " " + N % P );
  }

  public static int calT(int num, int T) {

    int sum = num / T;
    if( num % T != 0 ) sum += 1;

    return sum;
  }

}
