/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class LeetCode747 {

    public int dominantIndex(int[] nums) {
         int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
       
        for (int i = 0; i < nums.length; i++) {
            if (i == index) {
                continue;
            }
            if (nums[i]*2 > max) {
                index = -1;
                break;
            }
            
        }
        return index;
    }
}
