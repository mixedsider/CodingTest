class Solution {
    public int solution(int n) {
        int answer = 0;
        for( int i = 1; answer == 0; i++) {
            if( n % i == 1 ) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}