
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
public class Contest939B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double m = input.nextDouble();
        long rminder = Integer.MAX_VALUE;
        long count = 0;
        long type = 0;
        for (int i = 0; i < m; i++) {
            double value = input.nextDouble();
            long ownCount = (long) (n / value);
            long ownReminder = (long) (n % value);
            if (ownReminder < rminder) {
                rminder = ownReminder;
                type = i + 1;
                count = ownCount;
            }
        }
            System.out.println(type + " " + count);
    }
}
