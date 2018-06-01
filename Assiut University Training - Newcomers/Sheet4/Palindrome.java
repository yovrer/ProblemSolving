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


public class Palindrome {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        int length = (int) Math.ceil(word.length() / 2.0);
        for (int i = 0, j = word.length() - 1; i < length; i++, j--) {
            if (word.charAt(i) != word.charAt(j)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
