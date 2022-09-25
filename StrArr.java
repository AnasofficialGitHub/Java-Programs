import java.util.Scanner;
public class StrArr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words going to enter");
		int n = scan.nextInt();	
		String s[] = new String[50];
		System.out.println("Enter the words : ");
		for(int i=0;i<n;i++)
			s[i]=scan.next( );
		
		char b[]=new char[50];
		for(int j=0;j<n;j++){
			char c[] = s[j].toCharArray();
			for(int k=1;k<n-1;k++){
				char ch[] = s[k].toCharArray();
				for(int l=0;l<c.length;l++){
					if(c[l]==ch[l])
						b[l]=c[l];
					else
						break;
					
				}
			}
		
		}
		for(int m=0;m<b.length;m++)
			System.out.printf("%c",b[m]);
		
	}
} 