import java.util.Scanner;
public class Nqueens{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=scan.nextInt();
		char table[][]=new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				table[i][j]='.';
		//solution(table,n);
		int count =0;
		backtrack(table,n,0,0);
		
	}
	public static void solution(char arr[][],int n){
		if(backtrack(arr,n,0,0))
			print(arr,n);
		else
			System.out.println("No solution");
	}	
	public static boolean backtrack(char arr[][],int n,int r,int c){
		if(c==n){
			print(arr,n);
			if(r==n)
				return true;
			else{
				c=0;
			}
		}
		else if(r==n){
			return false;
		}
		int i;
		//for(i=0;i<n;i++){
			if(solve(arr,n,r,c)){
				arr[r][c]='Q';
				if(backtrack(arr,n,0,c+1))
					return true;
				arr[r][c]='.';
			}
			return backtrack(arr,n,r+1,c);
		//}	
		//return false;
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