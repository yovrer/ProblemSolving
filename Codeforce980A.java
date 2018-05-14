import java.util.Scanner;

public class Codeforce980A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String o = word.replaceAll("-", "");
        String min = word.replaceAll("o", "");

        if (o.length() == 0 || min.length() % o.length() == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}