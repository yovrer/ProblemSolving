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


public class LetsPlayWithStrings {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        int [] frequency = new int[26];
        for (char c: word.toCharArray()) {
            ++frequency[c - 'a'];
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0){
                out.append((char) (i + 'a')).append(" : ").append(frequency[i]).append("\n");
            }
        }
        System.out.println(out.toString().trim());
    }
}
