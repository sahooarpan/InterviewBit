class ListNode {
      public int val;
      public ListNode next;

      ListNode(int x) 
      { val = x; next = null; }
  }

  public class Solution {
  	static ListNode rotate(int k)
  	{
  		if(k==0)
  			return ;
  		ListNode curr=head;
  		int count=1;
  		while(count<k && curr!=null)
  		{
  			curr=curr.next;
  			count++;

  		}
  		if (curr==null) 
  		{
  			return;
  			
  		}
  		ListNode kthNode=curr;
  		while(curr.next!=null)
  			curr=curr.next;
  		curr.next=head;
  		head=kthNode.next;
  		kthNode.next=null;
  		

  	}
  }