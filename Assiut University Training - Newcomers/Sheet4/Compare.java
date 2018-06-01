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


public class Compare {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x = input.readLine();
        String y = input.readLine();
        if (x.compareTo(y) < 0) {
            System.out.println(x);
        }else {
            System.out.println(y);
        }
    }
}
