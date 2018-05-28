
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
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
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int q = input.nextInt();
        int n = input.nextInt();
        int [] d= new int[q];
        for (int i = 0; i < q; i++) {
            d[i] = input.nextInt();
        }
        double sum = s;
        
        Arrays.sort(d);
        for (int i = 0; i < q; i++) {
            if (((d[i]/100.0)*sum) > n) {
                sum+= ((d[i]/100.0)*sum);
            }else{
            sum+= n;
            }
        }
        NumberFormat formatter = new DecimalFormat("#0.00000000000"); 
        System.out.println(formatter.format(sum));
    }
}
