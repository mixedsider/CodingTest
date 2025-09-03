import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  static class Struct {
    private int importance;
    private int index;

    public Struct(int importance, int index) {
      this.importance = importance;
      this.index = index;
    }

    public int getImportance() {
      return this.importance;
    }

    public int getIndex() {
      // 인덱스
      return this.index;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int documents = Integer.parseInt(br.readLine());

    for (int i = 0; i < documents; i++) {
      Queue<Struct> qu = new LinkedList<>();

      String[] input = br.readLine().split(" ");
      int n = Integer.parseInt(input[0]); // 총 문서 갯수
      int m = Integer.parseInt(input[1]); // m index가 몇번째로 출력하는가?

      int[] importances = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for( int j = 0; j < n; j++ ) {  // 우선순위와 인덱스를 입력
        Struct s = new Struct(importances[j], j);
        qu.add(s);
      }

      int output = 1; // 출력 번수
      while( !qu.isEmpty() ){ // 큐를 순회
        int max = qu.stream().mapToInt(s -> s.getImportance()).max().getAsInt(); // 최대 중요도
        Struct s = qu.poll();
        if( s.getImportance() < max ) { // 최대치의 중요도보다 작은 경우
          qu.offer(s);
          continue;
        }
        if( s.getIndex() == m ) { // 찾는 인덱스인가?
          System.out.println(output); // 몇번째 출력인지
          break;
        }
        // 중요도가 최대치인경우 삭제
        output++; // 출력 번수 증가
      }
    }
  }
}