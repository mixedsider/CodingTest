class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for( int i = 1; i < food.length; i++ ) {
            if( food[i] > 1 ) {
                sb.append(String.valueOf(i).repeat(food[i] / 2));
            }
        }
        String temp = sb.toString();
        temp += "0";
        sb.reverse();
        return temp + sb.toString();
    }
}