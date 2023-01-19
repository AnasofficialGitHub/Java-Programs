import java.util.Scanner;
public class StringBroke{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] dic= {"I" , "have", "Jain", "Sumit", "am", "this", "dog"};		
		System.out.println("Enter the String");
		String s = scan.next();
		int i,j,flag=0;
		String str="",ans="";
		for(i=0;i<s.length();i++){
			str=str+s.charAt(i);
			flag=0;
			for(j=0;j<dic.length;j++){
				if(str.equals(dic[j])){
					flag=1;
					ans=ans+str+" ";
					str="";
					break;					
				}		
			}
		}
		if(flag==1)
			System.out.println(ans);
		else
			System.out.println("String cant be broken");

	}
	
}