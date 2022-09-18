import java.util.Scanner;
public class ReverseAbcToZyx{
	public static void main(String[] args){
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		String s = "abcdefghijklmnopqrstuvwxyz";
		String ss = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] a = s.toCharArray();
		char[] b = ss.toCharArray();
		String str = scan.next();
		char[] c = str.toCharArray();
		
		for(k=0;k<str.length();k++){
			if(c[k] <= 90){
				for(i=0,j=25;i<26;i++,j--){
					if(c[k] == b[i]){
						System.out.print(b[j]);
					}
				}
			}
			else if(c[k] <= 122){
				for(i=0,j=25;i<26;i++,j--){
					if(c[k] == a[i]){
						System.out.print(a[j]);
					}
				}
			}
		}		
		
	}
}