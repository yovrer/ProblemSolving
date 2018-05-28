/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class MainFor {
    public static void main(String[] args) {
        int x = 10;
        int count = 0;
        for (int i = 1; i < 8; i++) {
            System.out.println(Integer.toBinaryString(i));
            count+= Integer.bitCount(i);
        }
        System.out.println(count);
    }
}
