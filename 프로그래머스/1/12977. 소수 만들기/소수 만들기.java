import java.util.*;
class Solution {
    public boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int[] nums) {
        int answer = 0;

        for( int i = 0; i < nums.length; i++ ) {

            for( int j = i+1; j < nums.length; j++ ) {

                for( int l = j+1; l < nums.length; l++ ) {

                    int sum =  nums[i] + nums[j] + nums[l];

                    if( isPrime(sum) ) answer++;
                }
            }
        }
        return answer;
    }
}