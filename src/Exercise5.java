import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.print("Enter string to reverse...");
	String str = sc.nextLine();
	String result = "";
	int len = str.length();
	
	for(int i = len-1; i >= 0; i--)
	{       
	     result = result + str.charAt(i);
	}
	System.out.print("Reversed string - ");
	System.out.print(result);
     sc.close();
	}

}