import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] nums = new int[9];

    for( int i = 0; i < 9; i++ ) {
      nums[i] = sc.nextInt();
    }

    int maxIndex = 0;
    int maxValue = nums[0];

    for( int i = 1; i < 9; i++ ) {
      if( nums[i] > maxValue ) {
        maxValue = nums[i];
        maxIndex = i;
      }
    }

    System.out.println( maxValue );
    System.out.println( maxIndex +1 );
  }
}
