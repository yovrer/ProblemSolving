
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
public class Contest151A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int l = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int p = input.nextInt();
        int nl = input.nextInt();
        int np = input.nextInt();
        int dirink = ( k * l) /nl;
        int limon = c * d;
        int salt =  p / np;
        System.out.println(Math.min(dirink, Math.min(limon, salt)) / n);
    }
}
