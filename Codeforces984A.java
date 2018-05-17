import java.util.Arrays;
import java.util.Scanner;

public class Codeforces984A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        if (n % 2 ==0){
            System.out.println(numbers[(n-1)/2]);
        }else{
            System.out.println(numbers[n/2]);
        }
    }
}
