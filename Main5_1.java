/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import condeforce.*;

/**
 *
 * @author rn-sshawish
 */
public class Main5_1 {
    public static void main(String[] args) {
        System.out.println(lexsmallest("rvofqorvfq"));
    }
    
    
   public static String lexsmallest(String s){
       
       boolean [] a = new boolean[26];
       char letter = Character.MAX_VALUE;
       for (int i = 0; i < s.length(); i++) {
           if (!a[s.charAt(i)-'a']) {
               a[s.charAt(i)-'a'] = true;
               if (s.charAt(i) < letter) {
                   letter = s.charAt(i);
               }
           }else{
               if (s.charAt(i) == letter) {
                   break;
               }
           }
       }
       return String.valueOf(letter);
   }
}
