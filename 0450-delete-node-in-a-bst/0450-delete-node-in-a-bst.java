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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        TreeNode curr=root;
        if(key<curr.val){
            curr.left=deleteNode(curr.left,key);
        }
        else if(key>curr.val){
            curr.right=deleteNode(curr.right,key);
        }
        else
        {

        if(curr.left==null && curr.right==null){
            return null;
        }
        if(curr.left==null ){
            return curr.right;
        }
        if(curr.right==null){
            return curr.left;
        }
        TreeNode temp=curr.right;
        while(temp.left!=null){
            temp=temp.left;
        }
        curr.val=temp.val;
        curr.right=deleteNode(curr.right,temp.val);


        }
        return curr;





        
    }
}