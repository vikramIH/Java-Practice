package main;

public class UnspecifiedNumberSum {
	public static int func(int n, int a, int b, int c){
		
		int sum = 0;
		
		int intStorage[] = new int[n];
				
		intStorage[0] = a;
		intStorage[1] = b;
		intStorage[2] = c;
		
		for( int i = 0; i < n; i++ ) {
			sum = sum + intStorage[i];
		}
		
		return sum;
	
}
}