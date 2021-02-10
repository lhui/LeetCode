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
    // 其他人的递归的思路
    public int maxDepth(TreeNode root) {
         if(root==null)  //遍历到根结点返回
            return 0;
        else{
            int l = maxDepth(root.left);   //左子树高度
            int r = maxDepth(root.right);  //右子树高度
            return l>r?l+1:r+1;  //左右子树中高的那个为最大深度
        }
    }
}
