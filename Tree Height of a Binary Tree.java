

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) 
    {
        if(root==null)
        {
            return 0;
        }
        return solve(root)-1;
    }
    public static int solve(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=solve(root.left);
        int r=solve(root.right);

        return 1+Math.max(l,r);
    }

