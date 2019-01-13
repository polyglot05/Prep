// Check if valid BST

// last value processed
int last = -1;
// whether every comparison so far has been true
boolean valid = true;

boolean checkBST(Node root) {
    // Empty tree is a BST
    if (root == null) {
        return true;
    }
    // Check the left sub tree
    checkBST(root.left);
    // current node MUST be GREATER than previous
    if (root.data <= last) {
        valid = false;
    } else {
        last = root.data;
    }
    checkBST(root.right);
    return valid;
}
