from base.node import TreeNode 

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        self.inorder(root, res)
        return res
    
    def inorder(self, root: TreeNode, res: List[int]):
        if root:
            self.inorder(root.left, res)
            res.append(root.val)
            self.inorder(root.right, res)
        