package main;
import java.util.Scanner;

public class StringRepeat {

	public static String func(String str, int n) {
	
	int len = str.length();
	String str2 = "";
	String res = "";
	
	for ( int i = n; i > 0; i--)
	str2 = str2 + str.charAt(len-i);
		
	while( n > 0 )
	{   
		n--;
		res = res.concat(str2);
	}
	
	return str.concat(res);
     
	}

}