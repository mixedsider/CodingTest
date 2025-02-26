import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        final int[] supo1 = {1, 2, 3, 4, 5};
        final int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int supo1Index = 0;
        int supo2Index = 0;
        int supo3Index = 0;

        int[] supos = new int[3];

        for( int answer : answers ) {

            if( answer == supo1[supo1Index] ) {
                supos[0]++;
            }
            if( answer == supo2[supo2Index] ) {
                supos[1]++;
            }
            if( answer == supo3[supo3Index] ) {
                supos[2]++;
            }

            supo1Index++;
            supo2Index++;
            supo3Index++;

            if( supo1Index == supo1.length ) {
                supo1Index = 0;
            }
            if( supo2Index == supo2.length ) {
                supo2Index = 0;
            }
            if( supo3Index == supo3.length ) {
                supo3Index = 0;
            }

        }

        int max = -1;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < supos.length; i++ ) {
            if( max < supos[i] ) max = supos[i];
        }

        for( int i = 0; i < supos.length; i++ ) {
            if( max == supos[i] ) result.add(i+1);
        }

        return result.stream().mapToInt(item -> item).toArray();
    }
}