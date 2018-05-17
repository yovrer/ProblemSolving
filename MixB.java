import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MixB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int topSum = 0;
        int buttomSum = 0;
        ArrayList<Pair> data = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int top = input.nextInt();
            int bottom = input.nextInt();
            data.add(new Pair(top, bottom, top - bottom));
            topSum += top;
            buttomSum += bottom;

        }
        Collections.sort(data);
        int count = 0;
        for (int i = 0; i < n && topSum <= buttomSum; i++) {
            if (data.get(i).diff < 0){
                topSum = (topSum - data.get(i).x) + data.get(i).y;
                buttomSum = (buttomSum - data.get(i).y) + data.get(i).x;
                count++;
            }else{
                break;
            }
        }
        if (topSum > buttomSum){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}


class Pair implements  Comparable<Pair>{
    int x;
    int y;
    int diff;

    public Pair(int x, int y, int diff) {
        this.x = x;
        this.y = y;
        this.diff = diff;
    }

    @Override
    public int compareTo(Pair pair) {
       if (this.diff < pair.diff)
           return -1;
       else if (this.diff > pair.diff){
           return 1;
       }else{
           return 0;
       }
    }
}