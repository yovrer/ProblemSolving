package Sheet4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Suhaib Abu Shawish
 *
 * @date 01/06/2018
 *
 * */


public class IncrementDecrement {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        int max = 0;
        int value = max;
        for (int i = 0; i < word.length(); i++) {
            value += word.charAt(i) =='I' ? 1 : -1;
            max = Math.max(value, max);
        }
        System.out.println(max);
    }
}
