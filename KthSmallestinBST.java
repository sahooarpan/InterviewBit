class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
 
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
}

class Tree  
{
	private static int num=0;
	private static int count=0;

	public int kthSmallestinBST(TreeNode root,int k)
	
	{
		count=k;

	helper(root);
	return num;
	}

	public void helper(TreeNode root)
	{
		if(root.left!=null)
			helper(root.left);
		count--;
		if(count==0)
		{
			num=root.val;
			return;

		}
		if(root.right!=null)
		helper(root.right);


	}


	static TreeNode getMinimum(TreeNode root)
	{
		if(root==null)
			return null;
		while (root.left!=null) 
		{
			root=root.left;
			
		}
		return root;


	}


	static TreeNode find(TreeNode root,int data)
	{
		if(root==null)
			return null;
		else if (root.val==data) 
		{
			return root;
			
		}
		else if(root.val<data)
		{
			return find(root.left,data);

		}
		else
			return find(root.right,data);



	}


	public TreeNode getSuccessor(TreeNode root, int b) 
	{
		TreeNode curr=find(root,b);
		if(curr==null)
			return null;
		if(curr.right!=null)
			return getMinimum(root.right);
		else
		{
			TreeNode successor=null;
			TreeNode ancestor=root;
			while(ancestor!=curr)
			{
				if(curr.val<ancestor.val)
				{
					successor=ancestor;
					ancestor=ancestor.left;


				}
				else
					ancestor=ancestor.right;
			}
			return successor;




		}


	

	}

}

