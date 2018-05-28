
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class MinCostClimbingStairs {
    
    int [] data;
    public static void main(String[] args) {
        System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int [] {0,0,0,0}));
    }
    
    public int minCostClimbingStairs(int[] cost) {
        data = new int[cost.length];
        Arrays.fill(data, -1);
        return Math.min(generateResponse(cost, 0, 0), generateResponse(cost, 1, 0));
    }
    
    public int generateResponse(int[] cost, int index, int total ){
        if (index >= cost.length) {
            return total;
        }
        if (data[index]!= -1) {
            
        }
        total += cost[index];
        return data[index] =Math.min(generateResponse(cost, index+1,total), generateResponse(cost, index+2,total));
    }
    
}
