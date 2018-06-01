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


public class Count {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x = input.readLine();
        int sum = 0;
        for (char c: x.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
