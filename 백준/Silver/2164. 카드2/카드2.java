import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for( int i = 1; i <= n; i++ ) {
            queue.offer(i);
        }
        
        for( int i = 0; 1 != queue.size(); i++ ) {
            queue.remove();
            Integer num = queue.poll();
            queue.offer(num);
        }

        System.out.println(queue.poll());
    }
}
