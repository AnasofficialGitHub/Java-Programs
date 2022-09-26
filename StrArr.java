import java.util.Scanner;
public class StrArr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words going to enter");
		int n = scan.nextInt();	
		int i,j,k;
		String s[] = new String[50];
		System.out.println("Enter the words : ");
		for(i=0;i<n;i++)
			s[i]=scan.next( );
		
		char b[]=new char[50];
		
		for(i=0,k=1;i<n-1;k++,i++){
			for(j=0;j<s[k].length();j++){
				if(s[i].charAt(j)==s[k].charAt(j))
					b[j]=s[k].charAt(j);
				else
					break;
					
			}	
			
		}
		
		
		for(i=0;i<b.length;i++)
			System.out.printf("%c",b[i]);
		
	}
} 
