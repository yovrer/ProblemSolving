import java.util.Scanner;

public class Atcoder98A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Math.max(a*b, Math.max(a+b, a-b)));
    }
}
