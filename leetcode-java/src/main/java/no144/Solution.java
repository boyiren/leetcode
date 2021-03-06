package no144;

import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author boyiren
 * @date 2019-10-27
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }
}
