// Java program to ReverseString using StringBuilder
import java.lang.*;
import java.io.*;
import java.util.*;
class Kpallindrome  
{
	static int isKPallUtil(char str1[],char str2[],int m,int n)
	{
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for (int j=0;j<=n ;j++ ) 
			{
				if(i==0)
					dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				else if(str1[i-1]==str2[j-1])
					dp[i][j]=dp[i-1][j-1];
				else
					dp[i][j]=1+Math.min(dp[i-1][j],dp[i][j-1]);
				
			}


		}
		return  dp[m][n];


	}
	 static boolean isKPall(String str,int k)
	 {
	 	StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(str);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
        char[] ch1=str.toCharArray();  
        char[] ch2=input1.toCharArray();  
        return (isKPallUtil(ch1,str.length(),ch2 ,str.length())<=2);


	 }
	 public static void main(String[] args) {
	 	String str="acdcb";
	 	int k=2;
	 	if(isKPall(str,k))
	 		System.out.println("Yes");
	 	else
	 		System.out.println("No");

	 }
	
}