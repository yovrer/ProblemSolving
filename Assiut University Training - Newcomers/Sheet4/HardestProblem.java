package Sheet4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 *
 * @author Suhaib Abu Shawish
 *
 * @date 01/06/2018
 *
 * */


public class HardestProblem {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        if (word.length() < 3) {
            System.out.println(word);
        }else{
            char firstMini = word.charAt(word.length() - 1);
            int firstIndex = word.length() - 1;
            for (int i = word.length() - 2; i > 0; i--) {
                if ( firstMini < word.charAt(i)){
                    firstIndex = i;
                }else{
                    firstMini = word.charAt(i);
                }
            }

            String s = sortingString(word.substring(0, firstIndex));
            String m = sortingString(word.substring(firstIndex));

            char secandMini = word.charAt(0);
            int secandIndex = 0;
            for (int i = 1; i < word.length() - 1; i++) {
                if ( secandMini > word.charAt(i)){
                    secandIndex = i;
                }else{
                    secandMini = word.charAt(i);
                }
            }

            String s1 = sortingString(word.substring(0, secandIndex + 1));
            String m1 = sortingString(word.substring(secandIndex+1));
            String f1 = s + m;
            String f2 = s1 + m1;
            System.out.println(f1.compareTo(f2) < 0 ? f1 : f2);
        }
    }

    public static String sortingString(String word ){

        char[] chars = word.toCharArray();

        Arrays.sort(chars);

        return  new String(chars);
    }
}
