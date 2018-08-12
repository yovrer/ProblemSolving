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


public class LetSuseGetline {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String value = input.readLine();
        int index = value.indexOf("\\");
        if (index != -1) {
            System.out.println(value.substring(0, index));
        }else {
            System.out.println(value);
        }
    }
}
