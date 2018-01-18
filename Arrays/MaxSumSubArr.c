
 int max(int x,int y){
     return (x>y)?x:y;
 }
int maxSubArray(const int* arr, int n) {
    
	int start=0,max_so_far=0,end=0,s=0,max_curr=0,max_el=arr[0],i;
	for(i=0;i<n;i++)
	{
		max_curr+=arr[i];
		if(max_so_far<max_curr)
			max_so_far=max_curr;
			start=s;
			end=i;

		if(max_curr<0)
			max_curr=0;
			s=i+1;
		max_el=max(max_el,arr[i]);	
	}
	if(max_so_far==0)
	max_so_far=max_el;		

	return max_so_far;
    
}
