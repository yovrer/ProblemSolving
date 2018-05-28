
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Contest617A {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int position = Integer.parseInt(input.readLine());
        int result = 0;
        int step[] = {5, 4, 3, 2, 1};
        for (int i = 0; i < step.length; i++) {
            if (position >= step[i]) {

                result = position / step[i];
                if (position % step[i] != 0) {
                    result++;
                }
                break;
            }

        }
        System.out.println(result);

    }
}
