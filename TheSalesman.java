
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * problem : https://www.hackerrank.com/contests/world-codesprint-12/challenges/the-salesman
 * @author rn-sshawish
 */
public class TheSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] section;
        for (int i = 0; i < n; i++) {
            int size = input.nextInt();
            section = new int[size];
            for (int j = 0; j < size; j++) {
                section[j] = input.nextInt();
            }
            Arrays.sort(section);
            int sum = 0;
            for (int j = 0; j < size-1; j++) {
                sum += section[j]-section[j+1];
            }
            System.out.println(sum*-1);
        }
    }
}
