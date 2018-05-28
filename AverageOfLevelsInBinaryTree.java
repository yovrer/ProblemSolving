
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class AverageOfLevelsInBinaryTree {
    TreeMap<Integer, Data> levelSum = new TreeMap<>();
    
//     public List<Double> averageOfLevels(TreeNode root) {
//        
//         List<Double> output = new ArrayList<>();
//         processTree(root, 0);
//         for (Map.Entry<Integer, Data> double1 : levelSum.entrySet()) {
//             
//             output.add(double1.getValue().sum/double1.getValue().count);
//                     
//         }
//         
//         
//         return output;
//    }
    
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    
    if(root == null) return result;
    q.add(root);
    while(!q.isEmpty()) {
        int n = q.size();
        double sum = 0.0;
        for(int i = 0; i < n; i++) {
            TreeNode node = q.poll();
            sum += node.val;
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
        }
        result.add(sum / n);
    }
    return result;
}
     
     public void processTree (TreeNode root , int level){
         if (root == null) {
             
             return;
             
         }
         
        Data data = levelSum.get(level);
        
         if (data == null) {
             
             data = new Data();
             
             data.sum = root.val;
             
             data.count = 1;
             
             levelSum.put(level, data);
             
         }else{
             
             data.sum += root.val;

             ++data.count;
            
         }
         
         processTree(root.right, level + 1 );
         
         processTree(root.left, level + 1 );
         
     
     
     }
     
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

class Data {
    double sum ;

    double count;
}
