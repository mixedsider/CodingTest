import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int cards1Index = 0;
        int cards2Index = 0;
        boolean success = true;

        for( String str : goal ) {

            if( str.equals(cards1[cards1Index])) {
                if( cards1Index == cards1.length - 1) continue;
                cards1Index++;
            }
            else if( str.equals(cards2[cards2Index])) {
                if( cards2Index == cards2.length - 1) continue;
                cards2Index++;
            } else {
                success = false;
            }

        }
        return success ? "Yes" : "No";
    }
}