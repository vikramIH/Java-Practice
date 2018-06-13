import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter a character...");
	String str = "A special symbol";
	char c = sc.next().charAt(0);
	
	if ( c >= 'A' && c <= 'Z')
	 str = "A Capital letter";
	
	else if ( c >= 'a' && c <= 'z')
	 str = "A small letter";
	
	else if ( c >= '0' && c<= '9' )
	 str = "A Number";
	
	else
		;
	 
		
	System.out.println(str);	
	
     sc.close();
	}

}