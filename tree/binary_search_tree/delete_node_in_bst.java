/*
 * Given a BST, the task is to delete a node in BST, which can be broken down into
 * 3 scenarios:
 * case1: delete a leaf node in BST.
 * case2: delete a node with single child in BST.
 * case3: delete a node with Both Children in BST.
 */

package tree.binary_search_tree;

class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        return node;
    }

    // A utility function to do inorder traversal of BST 
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key + " ");
            inorder(root.right);
        }
    }
}