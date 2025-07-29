import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final String[][] wBoard = {
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"}
    };

    final String[][] bBoard = {
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"},
        {"B", "W", "B", "W", "B", "W", "B", "W"},
        {"W", "B", "W", "B", "W", "B", "W", "B"}
    };

    String[] xy = sc.nextLine().split(" ");
    int x = Integer.parseInt(xy[0]);
    int y = Integer.parseInt(xy[1]);

    int min = Integer.MAX_VALUE;

    String[][] strings = new String[x][y];
    for (int i = 0; i < x; i++) {
      strings[i] = sc.nextLine().split("");
    }

    // 바깥 두 개: 8x8 보드 시작점 잡기
    for (int i = 0; i <= x - 8; i++) {
      for (int j = 0; j <= y - 8; j++) {
        int wDiff = 0;
        int bDiff = 0;

        // 안쪽 두 개: 8x8 보드 내부 비교
        for (int a = 0; a < 8; a++) {
          for (int b = 0; b < 8; b++) {
            // (i+a, j+b)는 입력 보드의 좌표
            if (!strings[i + a][j + b].equals(wBoard[a][b])) wDiff++;
            if (!strings[i + a][j + b].equals(bBoard[a][b])) bDiff++;
          }
        }

        min = Math.min(min, Math.min(wDiff, bDiff));
      }
    }

    System.out.println(min);

  }
}
