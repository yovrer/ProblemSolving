/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author rn-sshawish
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        String n = Integer.toString(inputValue, 2);
        StringBuilder outPut;
        int size = n.length();
        while(size > 0) {
            outPut = new StringBuilder();
            for (int j = 0; j < (size / 2)+1; j++) {
                outPut.append('1');
            }
            for (int j = 0; j < (size / 2); j++) {
                outPut.append('0');
            }
            int value = Integer.parseInt(outPut.toString(), 2);
            if (inputValue % value == 0) {
                System.out.println(value);
                break;
            }
            --size;
        }

    }
}
