class Solution {
    public int solution(int number, int limit, int power) {
        
        int result = 0;
        for( int i = 1; i <= number; i++ ) {
            result += oncePerson(i, limit, power);
        }
        
        return result;
    }
    private int oncePerson(int number, int limit, int power) {
        int result = 0;
        if( number == 1) {
            return 1;
        }
        if( number >= 2) {
            result = 2;
        }
        for( int i = 2; i <= number / 2; i++ ) {
            if( number % i == 0 ) {
                result++;
            }
        }
        if( result > limit ) {
            result = power;
        }
        return result;
    }
}