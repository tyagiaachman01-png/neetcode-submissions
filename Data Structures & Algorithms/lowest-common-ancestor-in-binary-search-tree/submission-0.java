/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode t1 = root;
        while(t1!=null){
            if(t1.val>p.val && t1.val>q.val){
                t1= t1.left;
            }
            else if(t1.val<p.val && t1.val<q.val){
                t1= t1.right;

            }
            else{
                return t1;
            }
        }
        return null;

    }
}
