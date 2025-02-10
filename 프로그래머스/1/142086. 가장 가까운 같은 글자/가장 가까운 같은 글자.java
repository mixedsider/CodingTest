import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] sList = s.split("");
        for( int i = 0; i < sList.length; i++ ) {
            if( s.contains(sList[i]) ) {
                for( int j = i - 1; j >= 0; j-- ) {
                    if( sList[j].equals(sList[i]) ) {
                        answer[i] = i - j;
                        break;
                    }
                }
            }
        }
        return Arrays.stream(answer).map(item -> item == 0 ? -1 : item).toArray();
    }
}