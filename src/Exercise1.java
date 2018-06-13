import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	int n;
	
	System.out.println("Enter number...");
	n = sc.nextInt();
    
	if(n < 30 && n >20)
	{
		if( n % 2 == 0)
			System.out.println("Jerry");
		else
			System.out.println("Tom");
	}
	else
		System.out.println("The number is not in range.");
     sc.close();
	}

}
