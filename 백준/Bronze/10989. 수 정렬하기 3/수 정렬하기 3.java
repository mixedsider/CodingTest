import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    for( int i = 0; i < n; i++ ) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.stream(arr).sorted().forEach(r -> sb.append(r).append("\n"));
    System.out.println(sb.toString());
  }
}
