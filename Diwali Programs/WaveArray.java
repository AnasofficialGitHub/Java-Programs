import java.util.Scanner;
public class WaveArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		int i;
		int arr[]=new int[n];
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		convertToArray(arr,n);
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
			
	}
	public static void convertToArray(int arr[],int n){
		int i,j,temp;
		for(i=0;i<n;i++){
				if(i%2!=0){
					temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
		}
		
	}
}
	