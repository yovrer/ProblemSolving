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


public class NewYearsGift {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        System.out.println(word.replaceAll(",", " "));
    }
}
