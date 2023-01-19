import java.util.Scanner;
public class Suduko{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int table[][]=new int[9][9];
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				table[i][j]=scan.nextInt();
		solution(table);
		
	}
	public static void solution(int arr[][]){
		if(backtrack(arr,0,0))
			print(arr);
		else
			System.out.println("No solution");
	}
	public static boolean backtrack(int arr[][],int r,int c){
		if(r==9){
			c++;
			if(c==9)
				return true;
			else
				r=0;
		}
		if(arr[r][c]!=0)
			return backtrack(arr,r+1,c);
		for(int i=1;i<=9;i++){
			if(solve(arr,r,c,i)){
				arr[r][c]=i;
				if(backtrack(arr,r+1,c))
					return true;
				arr[r][c]=0;
			}
		}
		return false;
	}
	public static boolean solve(int arr[][], int r, int c, int num){
		int i,j;
		for(i=0;i<9;i++)
			if(arr[i][c]==num)
				return false;
		for(i=0;i<9;i++)
			if(arr[r][i]==num)
				return false;
		int rindex=(r/3)*3;
		int cindex=(c/3)*3;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				if(arr[rindex+i][cindex+j]==num)
					return false;
		return true;
	}
	public static void print(int arr[][]){
		int i,j;
		for(i=0;i<9;i++){
			for(j=0;j<9;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}