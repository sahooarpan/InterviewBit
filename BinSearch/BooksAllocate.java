import java.util.*;
class BooksAllocate  
{
	static boolean isValid(ArrayList <Integer> books,int b,int ans)
	{
		int students=1;
		int curr_pages=0;
		for (Integer i :books ) {
			if(curr_pages+i>ans)
			{
				curr_pages=i;
				students++;
				if(students>b)
					return false;

			}
			else{
			curr_pages+=i;
			}
		}
		return true;


	}
	static int books(ArrayList <Integer> books,int b)
	{
		int start=books.get(books.size()-1);
		int end=0;
		int finalAns=0;
		for (Integer i:books ) {
			end+=i;
			
		}
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(isValid(books,b,mid))
			{
				finalAns=mid;
				end=mid-1;

			}
			else 
			{
				start=mid+1;
			}

		}
		return finalAns;

	}
	public static void main(String[] args) {
		ArrayList <Integer> bookslist=new ArrayList<>();
		bookslist.add(12);
		bookslist.add(34);
		bookslist.add(67);
		bookslist.add(90);
		System.out.println(books(bookslist,2));
	}
	
}