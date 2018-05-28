
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
public class IUPC2k18Choklate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long count1 = 0;
        long count2 = 0;
        int even = n / 2;
        int odd = n % 2 == 0 ? even : even + 1;
        for (int i = 1; i <= n; i++) {
            long ch = input.nextLong();
            if (ch % 2 != 0) {
                count1++;
            } else{
                count2++;
            }
        }
        long sum = 0;
        if (even - count2 > 0) {
            System.out.println(even - count2);
        } else {
            System.out.println(odd - count1);
        }

    }
}
