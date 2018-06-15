package main;

public class NumberRepeat {

		public static int numRepeat (int n) {
				
				int num = 0;
				for ( int i = 1; i <= n; i++)
				{
				   for( int j = 1; j <= i; j++)
					  num = ( num * 10 ) + i;
				}
				
				return num;
		}
		
}