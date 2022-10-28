import java.util.Scanner;
public class FindExtra{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int m = scan.nextInt();
		int i, result;
		int a[]=new int[m];
		for(i=0;i<m;i++)
			a[i]=scan.nextInt();
		System.out.println("Enter the rows of second array");
		int n = scan.nextInt();
		System.out.println("Enter the elements");
		int b[] = new int[n];
		for(i=0;i<n;i++)
			b[i]=scan.nextInt();
		int index=findExtra(a,b,m);
		System.out.println(index);
	}
	public static int findExtra(int c[], int d[], int m){
		int i;
		for(i=0;i<m;i++){
			if(c[i]!=d[i]){
				return i;
			}
		}
		return 0;
					
	}
}