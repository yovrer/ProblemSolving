
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
public class YandexQuA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(input.nextInt());
        }

        int n = input.nextInt();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (hashSet.contains(input.nextInt())) {
                    count++;
                }
            }
            if (count > 2 ) {
                System.out.println("Lucky");
            }else{
                System.out.println("Unlucky");
            }
        }
    }
}
