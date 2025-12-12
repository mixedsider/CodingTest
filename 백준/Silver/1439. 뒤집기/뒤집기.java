import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int zero = 0;
        int one = 0;

        char[] numString = br.readLine().toCharArray();

        for( int i = 1; i < numString.length; i++ ) {
            if( numString[i-1] != numString[i] ) {
                if( numString[i-1] == '0') zero += 1;
                else one += 1;
            }
        }

        if( numString[numString.length-1] == '0') zero += 1;
        else one += 1;
        
        System.out.println( zero >= one ? one : zero);
    }

}