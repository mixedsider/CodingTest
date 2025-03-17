import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        
        StringBuilder result = new StringBuilder();

        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        for( String s : X.split("") ) {
            int num = xMap.getOrDefault(s, 0);
            xMap.put(s, ++num);
        }
        for( String s : Y.split("") ) {
            int num = yMap.getOrDefault(s, 0);
            yMap.put(s, ++num);
        }

        for( String s : xMap.keySet() ) {
            int numX = xMap.get(s);
            int numY = yMap.getOrDefault(s, 0);
            if( numY == 0 ) {
                continue;
            }
            int min = Math.min(numX, numY);
            result.append(s.repeat(min));

        }
        
        if( result.length() == 0) {
            return "-1";
        }
        
        if( result.toString().replace("0", "").length() == 0) {
            return "0";
        }

        return result.reverse().toString();
    }
}