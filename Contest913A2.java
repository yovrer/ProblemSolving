
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
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
public class Contest913A2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        long m = input.nextInt();
//        BigInteger first = BigInteger.valueOf(m).mod( BigInteger.valueOf(2L).pow(n));
//        System.out.println(first);

        HashSet<String> d = new HashSet<>();
        d.add("suhaib");
        d.add("mohammad");
        d.add("ali");
        
        System.out.println(d.removeAll(Arrays.asList("mooooo")));
        
        System.out.println(d);
        
    }
   
}
