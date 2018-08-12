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

public class CapitalAndSmall {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        StringBuilder out = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)){
                out.append(Character.toLowerCase(c));
            }else{
                out.append(Character.toUpperCase(c));
            }
        }
        System.out.println(out);
    }
}
