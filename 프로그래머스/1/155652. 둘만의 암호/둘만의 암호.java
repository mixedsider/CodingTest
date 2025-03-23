class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        String[] sArrays = s.split("");
        
        for( int i = 0; i < sArrays.length; i++ ) {
            
            String sOne = sArrays[i];
            
            answer += addIndex(sOne, skip, index);
        }
        
        return answer;
    }
    private String addIndex(String sOne, String skip, int index) {
        int c = sOne.equals("z") ? 'a' : sOne.charAt(0) + 1;
        String ch1 = String.valueOf((char) (c));

        int count = skip.contains(String.valueOf((char) c)) ? index : index - 1;

        if( count <= 0 ) {
            return String.valueOf((char) c);
        }

        return addIndex(ch1, skip, count);
    }
}
