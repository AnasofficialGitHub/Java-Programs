import java.util.Scanner;
public class MaxMin{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n,i,j,temp;
		n=scan.nextInt();
		int[] arr = new int[10];
		System.out.println("Enter the array");
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int max=arr[n-1],min=arr[0];
		System.out.println("Maximum Value : "+max);
		System.out.println("Minimum Value : "+min);
		
	}
}