import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] nums = new int[15][15];
    for(int i = 0; i < 15; i++) {
      nums[0][i] = i;
    }

    int T = sc.nextInt();
    for (int index = 0; index < T; index++) {

      int k = sc.nextInt();
      int n = sc.nextInt();

      for (int i = 1; i <= k; i++) {

        for (int j = 1; j <= n; j++) {

          nums[i][j] = nums[i-1][j] + nums[i][j-1];
        }
      }

      System.out.println(nums[k][n]);
    }
  }
}
