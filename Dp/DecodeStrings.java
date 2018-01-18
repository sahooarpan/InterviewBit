class DecodeStrings  
{
	static int decode(String message)
	{
		int msgLen=message.length();
		int []decodeCount=new int[msgLen+1];
		decodeCount[0]=1;
		decodeCount[1]=1;
		for (int i=2;i<=msgLen;i++ ) 
		{
			if(message.charAt(i-1)>'0')
				decodeCount[i]=decodeCount[i-1];
			if((message.charAt(i-2)<'2') ||((message.charAt(i-2)=='2')&& message.charAt(i-1)<'7'))
				decodeCount[i]+=decodeCount[i-2];
			
		}
		return decodeCount[msgLen];

	}

	public static void main(String[] args) {
		System.out.println(decode("12"));
	}

}