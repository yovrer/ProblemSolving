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


public class Feedback {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String word;
        for (int i = 0; i < n; i++) {
            word = input.readLine();
            System.out.println(word.contains("010") || word.contains("101") ? "Good" : "Bad");
        }

    }
}
