import java.util.Scanner;
public class JoinString{
	public static void main(String[] args){
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words in word1");
		int m=scan.nextInt();
		System.out.println("Enter the number of words in word2");
		int n=scan.nextInt();
		String word1[]=new String[m];
		String word2[]=new String[n];
		System.out.println("Enter the word1");	
		for(i=0;i<m;i++)
			word1[i]=scan.next();
		System.out.println("Enter the word2");	
		for(i=0;i<n;i++)
			word2[i]=scan.next();
		String s1="";
		String s2="";
		for(i=0;i<m;i++)
			s1=s1+word1[i];
		for(i=0;i<n;i++)
			s2=s2+word2[i];
		if(s1.equals(s2))
			System.out.println("true");
		else
			System.out.println("false");
	}
	
}