import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        final int COUNT = Integer.parseInt(String.valueOf(br.readLine()));

        int sum = 0;

        for( int i = 0; i < COUNT; i++ ) {
            int input = Integer.parseInt(String.valueOf(br.readLine()));
            map.put(input, map.getOrDefault(input, 0) + 1);
            list.add(input);
            sum += input;
        }
        list.sort(Collections.reverseOrder());



        print(
                (int) Math.round((double) sum /COUNT),
                list.get(list.size()/2),
                mode(map),
                Math.abs(list.get(0) - list.get(list.size()-1))
        );
    }

    private static int mode(Map<Integer, Integer> map) {
        List<Integer> modeList = new ArrayList<>();
        int max = 0;
        for( Integer i : map.values() ) {
            max = Math.max(max, i);
        }
        for( Integer i : map.keySet() ) {
            if( max == map.get(i) ) modeList.add(i);
        }
        Collections.sort(modeList);
        return modeList.size() == 1 ? modeList.get(0) : modeList.get(1);
    }

    public static void print(Object ...obj) {
        Arrays.stream(obj).forEach(System.out::println);
    }
}
