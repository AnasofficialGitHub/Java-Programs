import java.util.Scanner;
public class WaterLevel{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int i,j,k;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]<=arr[j]){
					