
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
public class Main_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int t = input.nextInt();
            long sum = 0;
            for (int j = 0; j < t; j++) {
                sum+= getSum(input.nextInt());
            }
            if (sum % 3 ==0) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    
    public static long getSum(int n){
        
        long sum =0;
        while (n > 9) {
            sum+= n/10L;
            n%=10;
        }
        if (n>0) {
            sum+=n;
        }
        return sum;
    }
}
