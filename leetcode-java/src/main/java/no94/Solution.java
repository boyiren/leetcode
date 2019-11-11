package no94;

import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author boyiren
 * @date 2019-10-27
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            inorder(root.left, res);
            res.add(root.val);
            inorder(root.right, res);
        }
    }
}
