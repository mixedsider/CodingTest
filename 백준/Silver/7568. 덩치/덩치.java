import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static class Person {

    private int kg;
    private int cm;

    public Person(int kg, int cm) {
      this.kg = kg;
      this.cm = cm;
    }

    public boolean bigger(Person p1) {
      if( this.kg > p1.kg && this.cm > p1.cm ) {
        return true;
      }
      return false;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    int n = Integer.parseInt(br.readLine());

    Person[] people = new Person[n];
    for (int i = 0; i < n; i++) {
      String[] line = br.readLine().split(" ");
      people[i] = new Person(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
    }

    for (int i = 0; i < n; i++) {
      int count = 1;

      for (int j = 0; j < people.length; j++) {
        if( people[i].equals(people[j]) ) {
          continue;
        }
        if( people[j].bigger(people[i]) ) {
          count++;
        }
      }
      System.out.print(count + " ");
    }
  }
}
