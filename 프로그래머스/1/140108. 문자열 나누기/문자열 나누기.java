class Solution {
    public int solution(String s) {
        String[] sArrays = s.split("");
        int result = 0;
        
        int first = 1;
        int other = 0;
        
        int firstIndex = 0;
        int otherIndex = 0;
        
        for( int i = 1; i < sArrays.length; i++ ) {
            if( sArrays[firstIndex].equals(sArrays[i]) ) {
                first++;
            } else {
                other++;
                otherIndex = i;
            }
            if( first == other ) {
                result++;
                first = 0;
                other = 0;
                firstIndex = otherIndex + 1;
            }
        }
        return sArrays.length != firstIndex ? result+1 : result;
    }
}