from base.node import TreeNode

class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        self.preorder(root, res)
        return res
    
    def preorder(self, root: TreeNode, res: List[int]):
        if root:
            res.append(root.val)
            self.preorder(root.left, res)
            self.preorder(root.right, res)