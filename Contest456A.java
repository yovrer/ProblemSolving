
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Contest456A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Point> pints = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            pints.add(new Point(input.nextInt(), input.nextInt()));
        }
        Collections.sort(pints);
        boolean state = false;
        for (int i = 0; i < n-1; i++) {
            if (pints.get(i).y < pints.get(i+1).y && pints.get(i).x > pints.get(i+1).x) {
                state = true;
            }
        }
        if (state) {
            System.out.println("Happy Alex");
        }else{
            System.out.println("Poor Alex");
        }
    }
}

class Point implements Comparable<Point> {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (y > o.y) {
            return 1;
        } else if (y < o.y) {
            return -1;
        } else {
            return 0;
        }
    }

}


