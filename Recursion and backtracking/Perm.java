import java.util.Scanner;
public class Perm{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char c[] = scan.next().toCharArray();
		rec(c,0,c.length-1);
	}
	public static void swap(char ch[],int i,int j){
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	public static void rec(char ch[],int i,int j){
		if(i==j){
			for(int a=0;a<ch.length;a++)
				System.out.print(ch[a]);
			System.out.println();
			return;
		}
		for(int a=i;a<=j;a++){	
			swap(ch,a,i);
			rec(ch,i+1,j);
			swap(ch,a,i);
		}
	}
}