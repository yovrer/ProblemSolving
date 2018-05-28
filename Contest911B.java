/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import condeforce.*;
import java.util.Scanner;

/**
 *
 * @author rn-sshawish
 */
public class Contest911B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int plate = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        double sume = a + b;
        double aPersentage = Math.round(((a*10)/sume))/10.0;
        double pPersentage = Math.round(((b*10)/sume))/10.0;
        int x =(int) Math.round(plate*aPersentage);
        int y =(int)Math.round(plate*pPersentage);
        if (x == 0) {
            x =1;
            y --;
        }else if(y == 0){
            y =1;
            x--;
        }
       int min = a % x == 0? a/x : (int)Math.ceil(a/x*1.0);
        System.out.println(Math.min(min, b%y == 0? b/y : (int)Math.ceil(b/y*1.0)));
    }
}
