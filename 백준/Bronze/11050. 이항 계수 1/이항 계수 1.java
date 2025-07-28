import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    System.out.println(solution(N, K));
  }

  public static long solution(int balls, int share) {

    share = Math.min(balls - share, share);

    if (share == 0)
      return 1;

    long result = solution(balls - 1, share - 1);
    result *= balls;
    result /= share;

    return result;
  }
}
