import java.util.Scanner;

public class MixA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        int f = x.charAt(0) - '0';
        int s = x.charAt(1) - '0';
        if (f ==0  || s == 0) {
            System.out.println("yes");
            return;
        }
        if (f % s == 0 || s % f == 0)
            System.out.println("yes");
        else
            System.out.println("no");


    }
}
