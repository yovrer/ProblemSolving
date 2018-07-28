import java.util.Scanner;

public class JUST2018H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            int value = input.nextInt();

            System.out.println((int)Math.ceil(Math.sqrt(value/6)));
        }

    }
}
