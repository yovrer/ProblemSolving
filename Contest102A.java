import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Contest102A {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String n = input.readLine();
        int sum = 0;
        int  count = 0;
        while (n.length() != 1){
            count++;
            sum = 0;
            for (int i = 0; i < n.length() ; i++) {
                sum += n.charAt(i) - '0';
            }
            n = String.valueOf(sum);
        }
        System.out.println(count);

    }
}
