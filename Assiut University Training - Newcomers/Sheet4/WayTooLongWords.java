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

public class WayTooLongWords {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String word;
        for (int i = 0; i < n; i++) {
            word = input.readLine();
            if (word.length() > 10 ) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
            }else{
                System.out.println(word);
            }
        }

    }
}
