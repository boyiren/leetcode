package no145;

import base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author boyiren
 * @date 2019-11-07
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            postorder(root.left, res);
            postorder(root.right, res);
            res.add(root.val);
        }
    }
}
