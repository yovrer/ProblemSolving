import java.util.Scanner;

public class Contest962A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] values = new int[n];
        values[0] = input.nextInt();
        for (int i = 1; i < n; i++) {
            values[i] = values[i - 1] + input.nextInt();
        }
        if (n == 1){
            System.out.println(1);
        }else{
            for (int i = 0; i < n; i++) {
                if (values[i] >= (values[n - 1] / 2.0)){
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
