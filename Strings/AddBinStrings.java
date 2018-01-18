import java.util.*;
class AddBinStrings  
{
	String addBinary(String a,String b)
	{
		String res="";//Initilalise result.
		int sum=0;//Initialise digit sum.

		int i=a.length()-1,j=b.length()-1;
		while(i>=0 || j>=0 || sum==1)
		{
			sum+=((i>=0)?a.charAt(i)-'0':0);
			sum+=((j>=0)?b.charAt(j)-'0':0);
			//If sum of current digit is 1 or 3 add 1 to result.
			res+=char(s%2+'0');
			//Compute carry.
			sum/=2;
			i--,j--;


		}
		return result;



	}
	
}