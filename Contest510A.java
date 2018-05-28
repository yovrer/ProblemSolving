
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Contest510A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        StringBuilder st1 = new StringBuilder();
        for (int i = 0; i < y; i++) {
            st1.append('#');
        }
        StringBuilder st2 = new StringBuilder();
        for (int i = 0; i < y-1; i++) {
            st2.append('.');
        }
         st2.append('#');
        StringBuilder st3 = new StringBuilder();
         st3.append('#');
        for (int i = 1; i < y; i++) {
            st3.append('.');
        }
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            if (i%2 != 0) {
                output.append(st1).append("\n");
            }else if (i%4 == 0) {
                 output.append(st3).append("\n");
            }else{
               output.append(st2).append("\n");
            }
        }
        System.out.println(output);
        
    }
}
