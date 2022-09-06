class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result = new ArrayList<Integer>();
      helper(root, result, 0);
      return result;
    }
    
    public void helper(Node curr, ArrayList<Integer> result, int currDepth){
        if(curr == null) return;
        
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        
        helper(curr.left, result, currDepth + 1);
        helper(curr.right, result, currDepth + 1);
    }
}
