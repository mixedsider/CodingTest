import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        
        int result = 0;
        
        String[] yes = {"aya", "ye", "woo", "ma"};
        String[] no = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for( String bab : babbling ) {
            
            for( String n : no ) {
                bab = bab.replace(n, "1");
            }
            
            for( String y : yes ) {
                bab = bab.replace(y, "2");
            }
            if( bab.matches("^[2]*$") ) {
                result++;
            }
        }
        
        return result;
    }
}