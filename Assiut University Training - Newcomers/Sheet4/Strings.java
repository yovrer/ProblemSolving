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

public class Strings {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x = input.readLine();
        String y = input.readLine();
        System.out.println(x.length() + " " + y.length());
        System.out.println(x + y);
        System.out.println(y.charAt(0) + x.substring(1) + " " + x.charAt(0) + y.substring(1));
    }
}
