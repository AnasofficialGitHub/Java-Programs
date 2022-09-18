import java.util.Scanner;
public class Compute2numbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scan.nextInt();
		System.out.println("Enter the second number : ");
		int b = scan.nextInt();
		if(a>b){
			System.out.printf("%d != %d   %d > %d   %d >= %d ",a,b,a,b,a,b);
		}
		else if(a<b){
			System.out.printf("%d != %d   %d < %d   %d <= %d ",a,b,a,b,a,b);
		}
		else if(a==b){
			System.out.printf("%d == %d   %d <= %d   %d >= %d ",a,b,a,b,a,b);
		}
	}
}