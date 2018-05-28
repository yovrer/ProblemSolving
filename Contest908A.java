
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest908A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        char letter = ' ';
        int count = 0;
        List<Character> voule= Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i)) && voule.contains(word.charAt(i))) {
                count++;
            }else if (Character.isDigit(word.charAt(i)) && (word.charAt(i)-'0')%2 != 0){
                count++;
            }
        
        
        }
        System.out.println(count);

    }
}
