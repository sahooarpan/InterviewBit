import java.util.*;
class WordBreak  
{
	static  boolean dictionaryCotains(String word)
	{
		String dictionary[]={"i","a","am","good","amgood"};
		for(int i=0;i<dictionary.length;i++)
		{	
		if(word.equals(dictionary[i]))
		{
			return true;

		}

		}
		return false;
	
	}

	static boolean wordBreak(String str)
	{
		int size=str.length();
		if(size==0)
			return true;
		boolean dp[][]=new boolean[size+1][size+1];
		for(int gap=1;gap<size;gap++)
		{
			for (int i=0;i<size-gap ;i++ ) 
			{
				int j=i+gap;
				String substr=str.substring(i,j+1);
				if(dictionaryCotains(substr))
					dp[i][j]=true;
				else 
				{
					for(int k=i;k<j;k++)
					{
						dp[i][j]=dp[i][j] |(dp[i][k] && dp[k+1][j]);

					}


				}
				
			}

		}
		return dp[0][size-1];

	}
	public static void main(String[] args) {
	
	if(wordBreak("iamgood"))
	 System.out.println("Yes");
	else
	System.out.println("NO");
	/*wordBreak("iiiiiiii")? System.out.println("Yes"): System.out.println("NO");
	wordBreak("")? System.out.println("Yes"): System.out.println("NO");
	wordBreak("ilikelikeimangoiii")? System.out.println("Yes"): System.out.println("NO");
	wordBreak("samsungandmango")? System.out.println("Yes"): System.out.println("NO");
	wordBreak("samsungandmangok")? System.out.println("Yes"): System.out.println("NO");*/
	}
}
