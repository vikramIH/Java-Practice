import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter number...");
	int num = sc.nextInt();
	int r,len=0, sum = 0;
	int arr[] = new int[10];
	int n = num, temp;	
	while( num != 0 )
	{
		num = num/10;
		len++;		
	}
	
	for ( int i = 0; i < len; i++)
	{
		r = n % 10;
		n = n/10;
		arr[i] = r;
		
	}
	
	for ( int i = len; i > 0; i-- )
	{
		for( int j = 0; j < i; j++ )
		{
			if( arr[j] < arr[j+1] )
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	System.out.print("After sorting - ");
	for( int i = 0; i < len; i++)
	{
		if( arr[i] % 2 == 0)
			sum = sum + arr[i];
		System.out.print(arr[i]);
	}
	
	if( sum > 15 )
		System.out.print("\nTrue");
	else
		System.out.print("\nFalse");
	
	
	
     sc.close();
	}

}