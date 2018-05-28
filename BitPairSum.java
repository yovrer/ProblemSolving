
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
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
public class BitPairSum {
    public static void main(String[] args) throws Exception  {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        for (int i = 0; i < t; i++) {
            int sum = 0;
            
            char [] bin = Integer.toString(Integer.parseInt(input.readLine()), 2).toCharArray();
            for (int j = 0; j < bin.length; j++) {
                for (int k = j+1; k < bin.length; k++) {
                    String x = bin[j]+""+bin[k];
                    sum += Integer.parseInt(x,2);
                }
            }
            System.out.println(sum);
        }
    }
}
