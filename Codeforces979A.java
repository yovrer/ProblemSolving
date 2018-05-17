import java.util.Scanner;

public class Codeforces979A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n == 0){
            System.out.println(0);
            return;
        }
        n++;
        if (n% 2 == 0){
            System.out.println(n / 2);
        }else{
            System.out.println(n);
        }
    }
}
