
import java.math.BigInteger;
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
public class Contest913A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        long b = 1;
        boolean state = true;
        for (int i = 1; i <= x; i++) {
            b *=2;
            if (b > y) {
                state = false;
            }
        }
        if (state) {
            System.out.println(y % b);
        }else{  
            System.out.println(y);
        }
    }
}


