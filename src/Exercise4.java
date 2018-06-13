import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter number...(1-100)");
	int n = sc.nextInt();
	int m = -1, i=10;
    
    while(m != n && i>0)
    {   
    	i--;
    	System.out.println("Guess number...(1-100)");
        m = sc.nextInt();
    	if(m > n)
    		System.out.println("Number is more than original");
    	else if (m < n)
    		System.out.println("Number is less than original");
    }
    
    if(i==0)
    	System.out.println("You failed");	
    else
    	System.out.println("Number matches");
	
     sc.close();
	}

}