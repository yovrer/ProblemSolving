/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import condeforce.*;
import java.util.ArrayList;

/**
 *
 * @author rn-sshawish
 */
public class MyCalendar {
    ArrayList<Pair> all ;
    
    public MyCalendar() {
        all = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        Pair p = new Pair();
        p.setStart(start);
        p.setEnd(end);
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).check(p)) {
                return false;
            }
        }
        all.add(p);
        
        return true;
    }
    
    public static void main(String[] args) {
        MyCalendar MyCalendar = new MyCalendar();
        System.out.println(MyCalendar.book(47, 20));// returns true
        System.out.println(MyCalendar.book(15, 25)); // returns false
        System.out.println(MyCalendar.book(20, 30)); // returns true
    }
    
}


class Pair {
    int start;
    int end;

    public void setEnd(int end) {
        this.end = end -1;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
    
    public boolean check (Pair pair){
        
        return (Math.max(0, (Math.min(this.end, pair.end) - Math.max(this.start, pair.start) + 1)) > 0);
    }
    
    
    
}