
import java.util.HashSet;
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
public class Contest939A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
           a[i] = input.nextInt();
        }
        boolean state = false;
        for (int i = 1; i <= n; i++) {
            if (i == a[a[a[i]]] && i != a[i]) {
                state = true;
                break;
            }
        }
        if (state) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

