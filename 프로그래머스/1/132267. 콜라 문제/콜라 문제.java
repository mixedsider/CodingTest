class Solution {
    public int solution(int a, int b, int n) {
        
        
        int result = 0;
        int remain = n;
        int changeBottle = 0;

        while ( true) {
            changeBottle = remain / a;
            if( remain < a ) break;
            remain -= a * changeBottle;
            remain += changeBottle * b;
            result += changeBottle * b;
        }
        
        
        return result;
    }
}