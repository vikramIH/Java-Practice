package main;
import java.util.Arrays;
import java.util.Scanner;

public class DigitsSort {

	public static int[] sort(int x)  {
	
    int r,len=0, sum = 0;
	int arr[] = new int[6];
	int n = x, temp;	
	while( x != 0 )
	{
		x = x/10;
		len++;		
	}
	
	for ( int i = 0; i < len; i++)
	{
		r = n % 10;
		n = n/10;
		arr[i] = r;
		
	}
//	System.out.println(Arrays.toString(a));
	for ( int i = len; i > 0; i-- )
	{
		for( int j = 0; j < len-1; j++ )
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
		System.out.print("\nTrue Sum greater than 15");
	else
		System.out.print("\nFalse - Sum not greater than 15");
	
	return arr;
}
	public static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}