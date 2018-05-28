
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
public class Contest476A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int twoCount = n/2;
        int oneCount = n % 2;
        int index = 1;
        int output = 0;
        if (twoCount + oneCount == m) {
            System.out.println(twoCount + oneCount);
        }else if ( twoCount*2 + oneCount == m) {
            System.out.println(twoCount*2 + oneCount);
        }else if (twoCount + oneCount < m && (twoCount*2 + oneCount) < m) {
            System.out.println(-1);
        }else {
            while (true) {
                output =m * index;
                if (output >= twoCount + oneCount) {
                    break;
                }
                index++;
            }

                System.out.println(output);
            
        }
        
    }    
}

