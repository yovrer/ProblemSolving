/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;

/**
 *
 * @author rn-sshawish
 */
public class Test2 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
        now.add(Calendar.MONTH, 2);
        System.out.println(now.get(Calendar.YEAR));
    }
}
