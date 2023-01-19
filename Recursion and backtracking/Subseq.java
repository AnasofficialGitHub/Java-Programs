import java.util.Scanner;
public class Subseq{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char s[]=scan.next().toCharArray();
		String str="";
		solve(s,0,str);		
	}
	public static void solve(char s[],int i,String str){
		if(i==s.length){
			System.out.print(str+" ");
			return;
		}
		solve(s,i+1,str+s[i]);
		solve(s,i+1,str);
	}
}