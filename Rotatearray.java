import java.util.Scanner;
public class Rotatearray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		System.out.println("Enter the numbers : ");
		int[] arr = new int[10];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		int[] temp = new int[10];
		temp[0]=arr[n-1];
		for(int i=1;i<n;i++){
			temp[i]=arr[i-1];

		}
		System.out.println("Rotated Array : ");
		for(int i=0;i<n;i++){
			System.out.printf("%d ",temp[i]);
		}
	}
}