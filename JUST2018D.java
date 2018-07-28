import java.util.Scanner;

public class JUST2018D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            int count = 0;
            int n = input.nextInt();
            for (int j = 0; j < n; j++) {
                if (input.nextInt() != 0){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}
