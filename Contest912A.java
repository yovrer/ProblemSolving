
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
public class Contest912A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long yellow  = input.nextInt();
        long blue  = input.nextInt();
        long x = input.nextInt();
        long y = input.nextInt();
        long z = input.nextInt();
        long sumYallo = x * 2L;
        sumYallo += y;
        long sumBlue = 3L * z + y;
        long req = 0;
        long yalReq = sumYallo - yellow;
        if (yalReq > 0) {
            req+= yalReq;
        }
        yalReq = sumBlue - blue;
        
         if (yalReq > 0) {
            req+= yalReq;
        }
         
         System.out.println(req);
        
        
    }
}
