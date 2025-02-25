import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int startNum = score.length % m;
        int result = 0;
        for( int i = startNum; i < score.length; i+= m){
            result += score[i] * m;
        }
        
        return result;
    }
}