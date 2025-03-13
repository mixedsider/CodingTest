import java.util.*;
import java.util.stream.*;
class Solution {
    public enum WIN {
        ONE(1, 6),
        TWO(2, 5),
        THREE(3, 4),
        FORE(4, 3),
        FIVE(5, 2),
        SIX(6, 1),
        OTHER(6, 0),
        ;

        private final int winNum;
        private final int count;

        WIN(int winNum, int count) {
            this.winNum = winNum;
            this.count = count;
        }

        public int getWinNum() {
            return this.winNum;
        }
        public int getCount() {
            return this.count;
        }

        public static int of(int num) {
            return Arrays.stream(WIN.values())
                    .filter(item -> item.getCount() == num)
                    .findFirst()
                    .map(WIN::getWinNum)
                    .orElse(0);
        }
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        
        List<Integer> lotto = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> win_num = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        int[] result = {0, 0};

        for( Integer integer : lotto ) {
            if( integer == 0 ) {
                result[0]++;
            }
            if( win_num.contains(integer) ) {
                result[0]++;
                result[1]++;
            }
        }

        result[0] = WIN.of(result[0]);
        result[1] = WIN.of(result[1]);

        return result;
    }
}