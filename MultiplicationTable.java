import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		int i,n,m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scan.nextInt();
		for(i=1;i<=10;i++){
			m=i*n;
			System.out.printf("%d x %d = %d",n,i,m);
			System.out.println();
		}	
	}
}