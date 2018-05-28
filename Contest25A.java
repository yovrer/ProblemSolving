
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
public class Contest25A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int even = 0;
        int lastEven = -1;
        int odd = 0;
        int lastOdd = -1;
        
        for (int i = 0; i < n; i++) {
            if (input.nextInt() % 2 ==0) {
                even++;
                lastEven = i + 1;
            }else{
                odd++;
                lastOdd = i + 1;
            }
        }
        System.out.println(even==1?lastEven:lastOdd );
    }
}
