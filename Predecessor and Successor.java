class GfG
{
    
    public void pre(Node root, Res p, int key){
        while(root != null){
            if(key <= root.key){
                root = root.left;
            } else{
                p = root;
                root = root.right;
            }
        }
    }
    
     public void suc(Node root, Res s, int key){
        while(root != null){
            if(key >= root.key){
                root = root.right;
            } else{
                s = root;
                root = root.left;
            }
        }
    }
    
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       pre(root, p, key);
       suc(root, s, key);
    }
}
