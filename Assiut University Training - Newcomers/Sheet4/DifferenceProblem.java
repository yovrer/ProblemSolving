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



public class DifferenceProblem {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x = input.readLine();
        int [] frequencyArray = new int[2];
        for (char c : x.toCharArray()) {
            ++frequencyArray[c - '0'];
        }
        System.out.println(Math.abs(frequencyArray[0] - frequencyArray[1]));
    }
}
