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

  class Index{
  	int index;
  }
class Solution 
{
	public static TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) 
	{
		int inStart=0;

		int inEnd=inorder.size()-1;
		//int postStart=0;
		//int postEnd=postorder.size()-1;
		Index pIndex=new Index();
		pIndex.index=inEnd-1;
		return buildTreeUtil(inorder,inStart,inEnd,postorder,pIndex);

    }
    static int search(ArrayList <Integer> inorder,int inStart,int inEnd,int val)
    {
    	for (int i=inStart;i<=inEnd;i++ ) 
    	{
    		if(inorder.get(i)==val)
    			return i;
    		
    	}
    	return -1;



    }

    public static TreeNode buildTreeUtil(ArrayList <Integer> inorder,int inStart,int inEnd,ArrayList <Integer> postorder,Index pIndex)
    {
    	if(inStart>inEnd)
    	{
    		return null;

    	}
    	TreeNode root=new TreeNode(postorder.get(pIndex.index));
    	(pIndex.index)--;

    	if(inStart==inEnd)
    	{
    		return root;
    	}
    	int inIndex=search(inorder,inStart,inEnd,root.val);
    	root.left=buildTreeUtil(inorder,inStart,inIndex-1,pIndex);
    	root.right=buildTreeUtil(inorder,inIndex+1,inEnd,pIndex);
    	return root;



    }
	
}