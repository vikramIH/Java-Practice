package main;

public class CheckCharacter {

	public static String func(char c) {
	
	String str = "";
	
	if ( c >= 'A' && c <= 'Z')
	 str = "A Capital letter";
	
	else if ( c >= 'a' && c <= 'z')
	 str = "A Small letter";
	
	else if ( c >= '0' && c<= '9' )
	 str = "A Number";
	
	else
	 str = "A Special symbol";
	 
		
	return str;	
	
   	}

}