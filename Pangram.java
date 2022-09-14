import java.util.*;
public class Pangram{
    public static void main (String[] args){
    	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word");
    	String str=sc.next();
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                arr[str.charAt(i)-'a']=1;
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                arr[str.charAt(i)-'A']=1;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
             System.out.println("0");
             return;
            }
        }
        System.out.println("1");
    }    
}
