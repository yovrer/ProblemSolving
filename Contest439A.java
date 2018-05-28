
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
public class Contest439A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int songs = input.nextInt();
        int sumSungs = (songs-1)*10;
        int duration = input.nextInt();
        int sum = sumSungs;
        for (int i = 0; i < songs; i++) {
            sum += input.nextInt();
        }
        if (sum > duration) {
            System.out.println(-1);
        }else{
            sumSungs+= duration - sum;
            System.out.println(sumSungs/5);
        }

    }
}
