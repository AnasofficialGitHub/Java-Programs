import java.util.Scanner;
public class SumOfArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int [10];
		int n,sum=0;
		System.out.println("how many numbers your going to give");
		n = scan.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.printf("%d ",arr[i]);
		}
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		System.out.println("Sum of arrays : "+sum);
	}
}