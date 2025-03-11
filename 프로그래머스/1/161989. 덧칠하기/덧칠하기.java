class Solution {
    public int solution(int n, int m, int[] section) {
        
        int result = 0;
        // 현재 위치 fainted
        int fainted = 0;
        for( int i = 0; i < section.length; i++ ) {
            // 현재 위치가 칠해진 위치보다 뒤인 경우
            if( section[i] > fainted ) {
                // 섹션 칠할 위치 + 붓사이즈 더하기
                fainted = section[i] + (m - 1); 
                result++;
            }
            
            // 그러면 다음 숫자가 나올 때 까지 section을 넘김
            continue;
        }
        
        return result;
    }
}