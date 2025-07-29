import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return this.x;
    }

    public int getY() {
      return this.y;
    }

    public static Coordinate from(String str) {
      String[] strs = str.split(" ");
      return new Coordinate(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
    }

    public String toString() {
      return x + " " + y;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    List<Coordinate> coordinates = new ArrayList<>();

    for( int i = 0; i < n; i++ ) {
      String str = sc.nextLine();
      coordinates.add(Coordinate.from(str));
    }

    coordinates.stream().sorted(
        (c1, c2) -> c1.getX() - c2.getX() == 0 ? c1.getY() - c2.getY() : c1.getX() - c2.getX())
        .forEach(c -> System.out.println(c.toString()));
  }
}
