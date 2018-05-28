
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
public class IUPCSimpleProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstSum = 4656;
        long n = input.nextLong();
        long sum = 0;
        BigInteger lastSum = new BigInteger(String.valueOf(sum));
        if (n <= 26) {
            long subSum = ((96 + n) * (96 + n + 1)) / 2;
            subSum -= firstSum;
           lastSum =  lastSum.add(BigInteger.valueOf(subSum));
        } else {
           
            lastSum=   lastSum.add(BigInteger.valueOf(2847L - 97));
            n -= 25;
            BigInteger thirdSum = BigInteger.valueOf(2847L).multiply(BigInteger.valueOf(n)).add(BigInteger.valueOf(97L));
            lastSum = lastSum.add(thirdSum);
        }
        
        System.out.println(lastSum);
    }
}
//2750 +  2847 * 2 + 97