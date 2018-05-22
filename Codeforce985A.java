import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Codeforce985A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        StringTokenizer tokn = new StringTokenizer(input.readLine());

        int [] values = new int[n/2];

        for (int i = 0; i < n / 2; i++) {

            values[i] = Integer.parseInt(tokn.nextToken());
        }

        Arrays.sort(values);

        int count1 = 0;

        int count2 = 0;

        for (int i = 0, j = 1; i < n/2 ; i++, j+=2) {
            count1 += Math.abs(values[i] - j);
        }

        for (int i = 0, j = 2; i < n/2 ; i++, j+=2) {
            count2 += Math.abs(values[i] - j);
        }

        System.out.println(Math.min(count1, count2));
    }
}
