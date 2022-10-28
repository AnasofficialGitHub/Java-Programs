import java.util.Scanner;
public class NumPattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int i,j,k;
		for(i=0;i<n;i++){
			for(j=0,k=n-1;j<n;j++,k--){
				if(i==0 || j==0 || i==n-1 || j==n-1)
					System.out.print(n);
				else
					if(j<n/2)
						System.out.print(n-j);
					else
						System.out.print(n-k);
			}
			System.out.println();
		}
	}
}