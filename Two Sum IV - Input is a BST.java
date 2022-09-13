class Solution {
    Set<Integer> res = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(res.contains(k - root.val)) return true;
        res.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
