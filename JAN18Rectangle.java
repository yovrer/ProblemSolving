
import java.util.HashMap;
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
public class JAN18Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, Integer> number;
        for (int i = 0; i < n; i++) {
            number = new HashMap<>();
            for (int j = 0; j < 4; j++) {
                int r = input.nextInt();
                number.put(r, number.getOrDefault(r, 0) + 1);
            }

            boolean state = true;
            for (Integer arg : number.values()) {
                if (arg == 4) {
                    break;
                }
                if (arg != 2) {
                    state = false;
                    break;
                }
            }
            if (!state) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
