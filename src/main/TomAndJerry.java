package main;

public class TomAndJerry {

	public static String func (int n) {
	
	String str;

   	if(n < 30 && n >20)
	{
		if( n % 2 == 0)
			str = "Jerry";
		else
			str = "Tom";
	}
	else
		str = "Invalid Entry";
   	
   	return str;
    
	}
	
}