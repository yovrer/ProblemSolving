
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
public class Contest916A {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int minits= input.nextInt();
        int hour = input.nextInt();
        int mini = input.nextInt();
        int count = 0;
        while (true) {
            if (hour % 10 == 7 || mini % 10 == 7) {
                break;
            }
            mini -= minits;
            count++;
            if (mini < 0) {
                mini += 60;
                hour -= 1;
            }
            if (hour < 0) {
                hour+= 24;
            }
        }

        System.out.println(count);
    }
}
