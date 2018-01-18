class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };
 
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
	RandomListNode curr=head,temp;
	//insert additional node after every node of original list.
	while (curr) 
	{
		temp=curr.next;
		curr.next=new RandomListNode(curr.label);
	 	curr.next.next=temp;
	 	curr=temp;
	}
	curr=head;
	//adjust random pointers of newly added nodes.
	while(curr)
	{
		curr.next.random=curr.random.next;
		curr=curr.next?curr.next.next:curr.next;
	} 
	RandomListNode original=head,copy=head.next;
	//save start of copied list.
	RandomListNode res=copy;
	//now separate original and copied list.
	while(original && copy)
	{
		original.next=original.next?original.next.next:original.next;
		copy.next=copy.next?copy.next.next:copy.next;
		original=original.next;
		copy=copy.next;		

	}
	return res;
    
    }
}
