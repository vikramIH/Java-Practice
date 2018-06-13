import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.print("Enter string ");
	String str = sc.nextLine();
	System.out.print("Enter number ");
	int n = sc.nextInt();
	int len = str.length();
	String str2 = "";
	
	for ( int i = n; i > 0; i--)
	str2 = str2 + str.charAt(len-i);
	
	System.out.print(str);
	
	while( n > 0 )
	{   
		n--;
		System.out.print(str2);
	}
     sc.close();
	}

}