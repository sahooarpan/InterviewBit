import java.util.*;
  class Solution {
    public  static ArrayList <Integer> solve(int p1,int p2,int p3,int n) {
    if(n<=0)
        return null;
 
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
 
    int i=0;
    int j=0;
    int k=0;
 
    while(list.size()<=n){
        int m2 = list.get(i)*2;
        int m3 = list.get(j)*3;
        int m5 = list.get(k)*5;
 
        int min = Math.min(m2, Math.min(m3, m5));
        list.add(min);
 
        if(min==m2)
            i++;
 
        if(min==m3)
            j++;
 
        if(min==m5)
            k++;
    }
    list.remove(0);
 
    return list;
}
    public static void main(String[] args) {
    	ArrayList <Integer> res=new ArrayList<>();
    	res=solve(2,3,5,5);
    	for (Integer i :res ) 
    	{
    		System.out.println(i);
    		
    	}
    }
}