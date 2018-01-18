import java.util.*;
class Inorder  
{
	static class Node 
	{
		int data;
		Node left;
		Node right;
		public Node(int data)
		{
			this.data=data;
			left=right=null;

		}

		
	}

	Node root;
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
	ArrayList <Integer> res=new ArrayList <>();
	if(a==null)
	return null;
	Stack <Node> st=new Stack <>();
	Node curr=root;
	while (curr!=null) 
	{
		st.push(curr);
		curr=curr.left;
			
	}

	while (st.size()>0) 
	{
		curr=st.pop();
		res.add(curr.data);
		if(curr.right!=null)
		curr=curr.right;
		while(curr!=null)
		{
			st.push(curr);
			curr=curr.left;
		}		
	}
	return res;	
	
	}

	
}