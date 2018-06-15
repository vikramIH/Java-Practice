package main;
public class Palindrome {

	public static int func(int num) {
		int originalInteger = num;
        int x = originalInteger;
        int reversedInteger = 0;   
        int remainder;
        int sum=0;
            while( num!= 0 )
	        {	
	        	remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num /= 10;
	//            System.out.println(reversedInteger);
	        }
    	
	        if (originalInteger == reversedInteger)
	        { System.out.println(originalInteger + " is a palindrome.");
		        while( x != 0 )
		        {
		            remainder = x % 10;
		            if(remainder%2 == 0)
		            {	
		            	sum = sum + remainder;
		            }
		            x  /= 10;
		        }
		            System.out.println("sum is "+ sum);   
		     }
	        else
	            System.out.println(originalInteger + " is not a palindrome.");
	        if (sum<25)
	    	{
	    		System.out.println("Sum is less than 25");
	    	}
	    	else
	    	{
	    		System.out.println("Sum is more than 25");
	    	}		
	        
	        return reversedInteger;    
	}
	
}