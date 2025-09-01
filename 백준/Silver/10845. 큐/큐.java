import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static class QueueClass {

    private Deque<Integer> queue = new LinkedList<>();

    public void push(int value) {
      this.queue.add(value);
    }
    public int pop() {
      return this.queue.isEmpty() ? -1 : this.queue.pollFirst();
    }
    public int size() {
      return this.queue.size();
    }
    public int empty() {
      return this.queue.isEmpty() ? 1 : 0;
    }
    public int front() {
      if( this.queue.isEmpty() )
        return -1;
      return this.queue.peek();
    }

    public int back() {
      if( this.queue.isEmpty() )
        return -1;
      return this.queue.peekLast();
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueClass q = new QueueClass();

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String[] command = br.readLine().split(" ");
      switch (command[0]) {
        case "push":
          q.push(Integer.parseInt(command[1]));
          break;
        case "pop":
          System.out.println(q.pop());
          break;
        case "size":
          System.out.println(q.size());
          break;
        case "empty":
          System.out.println(q.empty());
          break;
        case "front":
          System.out.println(q.front());
          break;
        case "back":
          System.out.println(q.back());
          break;
      }
    }
  }
}