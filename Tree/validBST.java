//Question: https://leetcode.com/problems/validate-binary-search-tree/

class Solution {
    TreeNode prev = null;

    public boolean validBST(TreeNode root) {

        if (root == null)
            return true;

        // inorder traversal must be sorted

        if (validBST(root.left) && (prev == null || root.val > prev.val)) {
            prev = root;
            return validBST(root.right);
        }

        return false;
    }
}
