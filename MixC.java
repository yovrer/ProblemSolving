import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MixC {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        for (int i = 0; i < t; i++) {
            String expression = input.readLine();
            int digits = 0;
            int operator = 0;
            int zero = 0;
            int minis = 0;
            int divide = 0;
            for (int j = 0; j < expression.length(); j++) {
                if (Character.isDigit(expression.charAt(i))){
                    digits++;
                }
                if (!Character.isLetterOrDigit(expression.charAt(i))){
                    operator++;
                }
                if (expression.charAt(i) == '-'){
                    minis++;
                }
                if (expression.charAt(i) == '0'){
                    zero++;
                }
                if (expression.charAt(i) == '/'){
                    zero++;
                }

            }


        }
    }
}
