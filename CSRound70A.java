
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
public class CSRound70A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int maxCount = Integer.MIN_VALUE;
        int value = 0;
        for (int i = start; i <= end; i++) {
            int copyValue = i;
            int holes = 0;
            while (copyValue > 9) {
                int target = copyValue % 10;
                holes += getNumberOfHoles(target);
                copyValue = copyValue / 10;
            }
            if (copyValue > -1) {
                 holes += getNumberOfHoles(copyValue);
            }
            if (holes > maxCount) {
                maxCount = holes;
                value = i;
            }
        }
        System.out.println(value);
    }

    public static int getNumberOfHoles(int n) {
        switch (n) {
            case 4:
            case 6:
            case 9:
            case 0:
                return 1;
            case 8:
                return 2;
            default:
                return 0;
        }
    }
}