import java.util.Scanner;

public class Exercise10 {
	public static void main(String args[]){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers");
		int NumberOfIntegers = sc.nextInt();
		int intStorage[] = new int[NumberOfIntegers];
		System.out.println("Enter the numbers");
		
		for(int i = 0;i < intStorage.length;i++) {
		intStorage[i] = sc.nextInt();
		}

		System.out.println("Your numbers are");

		for(int i = 0;i < intStorage.length;i++) {
		System.out.println(intStorage[i] + " ");
		}
		for(int i = 0;i < intStorage.length;i++) {
			sum = sum + intStorage[i];
		}
		System.out.println("Sum is "+ sum);
		sc.close();
}
}