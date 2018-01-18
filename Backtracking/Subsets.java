import java.util.*;
class Subsets  
{
	public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        for(Integer i:tempList)
        {
        	System.out.println(i);
        }
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}

public static void main(String[] args) {
	List <List <Integer>> res=new ArrayList <>();
	int arr[]={1,2,3};
	res=subsets(arr);
	for(int )
}
	
}