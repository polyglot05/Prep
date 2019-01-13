// The LCA for two nodes u and v is defined as the farthest node from root that is ancestor to both u and v
public static Node lca(Node root, int v1, int v2) {
  // Write your code here.
return (root.data - v1) * (root.data - v2) < 1 ? root : lca(v1 < root.data ? root.left : root.right, v1, v2);

}
