/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * https://leetcode.com/problems/set-mismatch/description/
 * @author rn-sshawish
 */
public class SetMismatch {
     public int[] findErrorNums(int[] nums) {
        int [] range = new int[nums.length];
        int [] output = new int[2];
         for (int i = 0; i < nums.length; i++) {
             range[nums[i]-1]++;
         }
         for (int i = 0; i < range.length; i++) {
             if (range[i]==0) {
                 output[1] = i + 1;
             }
              if (range[i]> 1) {
                 output[0] = i + 1;
             }
         }
         
         
         
         
         return output;
    }
     
     public static void main(String[] args) {
        SetMismatch s = new SetMismatch();
        
         System.out.println(s.findErrorNums(new int [] {1,2,2,4}));
    }
}
