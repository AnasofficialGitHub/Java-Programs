import java.util.Scanner;
public class Nqueen1Poss{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=scan.nextInt();
		char table[][]=new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				table[i][j]='.';
		solution(table,n);
		
		
	}
	public static void solution(char arr[][],int n){
		if(backtrack(arr,n,0,0))
			print(arr,n);
		else
			System.out.println("No solution");
	}	
	public static boolean backtrack(char arr[][],int n,int c){
		if(c==n){
			return true;
		}
		
		int i;
		for(i=0;i<n;i++){
			if(solve(arr,n,r,c)){
				arr[r][c]='Q';
				if(backtrack(arr,n,c+1))
					return true;
				arr[r][c]='.';
			}
			
		}	
		return false;
	}
	public static boolean solve(char arr[][], int n,int r, int c){
		int i,j; 
		for(i=0;i<n;i++)
			if(arr[i][c]=='Q')
				return false;
		for(i=0;i<n;i++)
			if(arr[r][i]=='Q')
				return false;
		for(i=r,j=c;i<n && j>=0;i++,j--)
			if(arr[i][j]=='Q')
				return false;
		for(i=r,j=c;i>=0 && j>=0;i--,j--)
			if(arr[i][j]=='Q')
				return false;
		return true;
	}
	public static void print(char arr[][],int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		//System.out.println(++count);
	}	
}