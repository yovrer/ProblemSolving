/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Main6 {
    static int  count;
    public static void main(String[] args) {
        giveChocolate(1 , 2);
        System.out.println(count);
    }
    
   public static void giveChocolate(int idx,int  limit) {
    if (idx > limit) return;
    if (limit == 1) {
        System.out.println("Give a Chocolate");
        count++;
        return;
    }
    giveChocolate(1, limit - 1);
    giveChocolate(idx + 1, limit);
}
}
