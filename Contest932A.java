
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest932A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        String reverseWord = reverse(word);
        if (reverseWord.equals(word)) {
            System.out.println(word);
        }else{
            System.out.println(word + reverseWord);
        }
    }
    
    public static String reverse(String word){
        StringBuilder out = new StringBuilder();
        for (int i = word.length()-1 ; i > -1; i--) {
            out.append(word.charAt(i));
        }
        return out.toString();
    }
}
