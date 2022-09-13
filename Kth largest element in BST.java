class Solution
{
    int count = 0;
    int result = Integer.MIN_VALUE;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        
        traverse(root, K);
        return result;
    }
    
    public void traverse(Node root, int K){
        if(root == null) return;
        traverse(root.right, K);
        count++;
        if(count == K) result = root.data;
        traverse(root.left, K);
    }
}
