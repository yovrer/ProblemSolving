import java.util.Scanner;

public class Codeforce672A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder myData = new StringBuilder();
        int i = 1;
        while (myData.length() < 1000){
            myData.append(i);
            i++;
        }
        System.out.println(myData.charAt(n - 1));
     }
}
