import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<String, Integer> minKey = new HashMap<>();
        int[] result = new int[targets.length];

        for( String key : keymap ) {

            String[] keySplit = key.split("");

            for( int i = 0; i < keySplit.length; i++ ) {
                int min = minKey.getOrDefault(keySplit[i], i+1);
                minKey.put(keySplit[i], Math.min(min, i+1));
            }

        }
        for(int i = 0; i < targets.length; i++ ) {
            String[] keySplit = targets[i].split("");
            for (String s : keySplit) {
                int getNum = minKey.getOrDefault(s, -1);
                if( getNum == -1 ) {
                    result[i] = -1;
                    break;
                }
                result[i] += getNum;
            }
        }

        return result;
    }
}