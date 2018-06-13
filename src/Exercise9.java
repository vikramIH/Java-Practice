import java.util.Scanner;

public class Exercise9 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		for (int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z')
			{	switch(c)
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':System.out.println(c+" It is a vowel");
				break;
				default: System.out.println(c+" It is consonant");
				}
			}	
			else
				System.out.println("It is invalid Input");
			
	}
	sc.close();
}
}