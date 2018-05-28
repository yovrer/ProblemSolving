/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Solution1 {

    public int solution(int[] A) {
        int conclusiveSum[] = new int[A.length];
        conclusiveSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            conclusiveSum[i] = conclusiveSum[i - 1] + A[i];
        }
        int max = 0;
        int targetSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i != 0) {
                targetSum = conclusiveSum[A.length - 1] - conclusiveSum[i - 1];
                if (targetSum > 0) {
                    max = Math.max(max, (A.length - 1) - i + 1);
                }
                targetSum = conclusiveSum[A.length - 2] - conclusiveSum[i - 1];
                if (targetSum > 0) {
                    max = Math.max(max, (A.length - 2) - i + 1);
                }
            } else {
                if (conclusiveSum[A.length - 1] > 0) {
                    max = Math.max(max, (A.length - 1) - i + 1);
                }
                if (conclusiveSum[A.length - 2] > 0) {
                    max = Math.max(max, (A.length - 2) - i + 1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().solution(new int[]{-1, -1, 1, -1, 1, 0, 1, -1, -1}));
    }
}
