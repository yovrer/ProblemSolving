
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
public class Contest912B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        long y = input.nextLong();

        if (y == 1) {
            System.out.println(x);
            return;
        }
        char[] d = Long.toString(x, 2).toCharArray();
        for (int i = 0; i < d.length; i++) {
            d[i] = '1';
        }
        System.out.println(Long.parseLong(new String(d), 2));
    }
}
