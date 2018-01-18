class VersionNos  
{

    public int compareVersion(String v1, String v2) {
    int vnum1=0,vnum2=0;
    for (int i=0,j=0;(i<v1.length() || j<v2.length()); )
	{
		while(i<v1.length() && v1.charAt(i)!='.')
		{
			vnum1=vnum1*10+(v1.charAt(i)-'0');
			i++;

		}
		while(j<v2.length() && v2.charAt(j)!='.')
		{
			vnum2=vnum2*10+(v2.charAt(j)-'0');
			j++;

		}
		if(vnum1>vnum2)
			return 1;
		if(vnum2>vnum1)
			return -1;
		vnum1=vnum2=0;
		i++;
		j++;

    	
    }
    return 0;


    }

	
}