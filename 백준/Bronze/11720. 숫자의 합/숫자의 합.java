import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int result = 0;
    sc.nextLine();

    String numbers = sc.nextLine();

    int[] num = Arrays
        .stream(numbers.split(""))
        .mapToInt(Integer::parseInt)
        .toArray();


    for (int i = 0; i < n; i++) {
      result += num[i];
    }

    System.out.println(result);
  }
}
