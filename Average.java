import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scan.nextInt();
		System.out.println("Enter the second number : ");
		int b = scan.nextInt();
		System.out.println("Enter the third number : ");
		int c = scan.nextInt();
		int sum = a+b+c;
		int average = sum/3;
		System.out.println("Average of three number is "+average);
	}
}