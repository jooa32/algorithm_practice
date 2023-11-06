class Solution:
        def buildTree(preorder, inorder):
                if not preorder or not inorder:
                        return None 
                root = TreeNode(preorder[0])
                root_index = inorder.index(preorder[0]) #mid 
                root.left = buildTree(preorder[1:root_index+1], inorder[:root_index])
                root.right = buildTree(preorder[root_index+1:], inorder[root_index+1:])
                return root 
