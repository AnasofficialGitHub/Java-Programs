import java.util.Scanner;
public class Library
{
	public static void main(String[] args)
	{
		home();
		
	}
	public static void home(){
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------Home---------------");
		System.out.println("\nAdmin\nUser\n");
		
		int i;
		String s = scan.next();
		
		switch(s){
		case "Admin":
			String adminname = "Nibila"; 
			String adminpwd = "Nibila@012";
			System.out.println("1.Signin");
			i=scan.nextInt();
			if(i==1)
				signin(adminname, adminpwd);
			else
				System.out.println("Enter the correct input");
			break;
			
		case "User":
			System.out.println("1.Signup\n2.Signin");
			i=scan.nextInt();
			break;
		default:
			System.out.println("Invalid input!!!");
			break;	
		}
	}
	public static void signin(String name, String pass){
		Admin ad = new Admin();
		System.out.println("\n***********Signin Page**************\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("User Name :");
		String a = scan.nextLine();
		if(a.equals(name)){
			System.out.println("Password : ");
			String b = scan.next();
			if(b.equals(pass)){
				ad.adminhome();
			}
			else {
				System.out.println("Password is Wrong");
				signin(name,pass);
			}
					
		}
		else{
			System.out.println("User name is wrong");
			signin(name,pass);
		}
	
	}
	public static int validator(String p){
   		int special=0,number=0,lower=0,upper=0;
 		char a[]=p.toCharArray();
            	if(a.length>=8){
       			for(int i=0;i<a.length;i++){
    				 if(a[i]>=35 && a[i]<=46 || a[i]==64)
				 	special++;
     				 else if(a[i]>=48 && a[i]<=57)
					number++;
     			 	 else if(a[i]>=65 && a[i]<=90)
					upper++;
    				 else if(a[i]>=97 && a[i]<=122)
					lower++;
		        }
		}
    		else{
      			System.out.println("Password Must be minimum 8 characters");
         		return 0;	
                }
		if(special>=1 && number>=1 && upper>=1 && lower>=1){
			return 1;
     		}
		else{
			System.out.println("Note:minimum 1 small letter, 1 capital letter, 1 special character and 1 number");
			return 0;
		}
	}
}
abstract class Login
{
	
	
	public abstract void view();
}
class Admin extends Login
{
	Scanner scan = new Scanner(System.in);
	String book[] = new String[50];
	int id[] = new int[50];
	int price[] = new int[50];
	int stock[] = new int[50];

	int n=0;
	public void adminhome(){
		System.out.println("1.View\n2.Add\n3.Update\n4.Delete");
		int i = scan.nextInt();
		switch(i){
		case 1:
			view();		
			System.out.println("Press 0 to back");
			int b= scan.nextInt();
			if(b==0)
				adminhome();
			else 
				System.out.println("Enter 0");
			break;
		
		case 2:
			add();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		default:
			System.out.println("Enter the correct number ");
			adminhome();
		}


	}
	public void view(){
		System.out.println("S.no\t\b\bBook Id\t\tBook Name\t\tPrice\t\tStock");
		for(int a=0;a<n;a++)
			System.out.println((a+1)+".\t"+id[a]+"\t"+book[a]+"\t"+price[a]+"\t"+stock[a]);
		
		
	}
	public void add(){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the number of books ");
		int num=scan.nextInt();
		
		
		for(int i=n;i<n+num;i++){
			System.out.println("Enter the book id");
			id[i]=scan.nextInt();
			System.out.println("Enter the book");
			book[i]=scan1.nextLine();
			System.out.println("Enter the book price ");
			price[i]=scan.nextInt();
			System.out.println("Enter the stock ");
			stock[i]=scan.nextInt();
			
		}
		n=n+num; 
		adminhome();
	}
	public void delete(){
		view();	
		System.out.println("Press the number of the book to delete");
		int del=scan.nextInt();
		del=del-1;
		String s = book[del];
		for(int a=0;a<n-1;a++){
			if(book[a] == s){
				String temp = book[a];
				book[a]=book[a+1];
				book[a+1]=temp;
				swap(id[a],id[a+1]);
				swap(price[a],price[a+1]);
				swap(stock[a],stock[a+1]);
				//int temp1 = id[a];
				//id[a]=id[a+1];
				//id[a+1]=temp1;
				//temp1 = price[a];
				//price[a]=price[a+1];
				//price[a+1]=temp1;
				//temp1 = stock[a];
				//stock[a]=stock[a+1];
				//stock[a+1]=temp1;
			}
		}
		book[n-1]="";
		n--;
		adminhome();
	}
	public void swap(int x, int y){
		int temp=x;
		x=y;
		y=temp;
	}
	public void update(){
		view();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the number of book you want to edit");
		int edit = scan.nextInt();
		edit = edit-1;
		System.out.println("1.Edit ID\n2.Change Book Name\n3.Change stock\n4.Change Price\n5.Back");
		int x=scan.nextInt();
		switch(x){
		case 1:
			System.out.println("Enter the new id");
			id[edit]=scan.nextInt();
			break;
		case 2:	
			System.out.println("Enter the book name");
			book[edit]=scan1.nextLine();
			break;
		case 3:
			System.out.println("Enter the new stock");
			stock[edit]=scan.nextInt();
			break;
		case 4:
			System.out.println("Enter the new price");
			price[edit]=scan.nextInt();
			break;
		case 5:
			adminhome();
			break;
		default:
			System.out.println("Enter the correct Number");
			break;
		}
		update();
			
	}

	
}
class User extends Login
{
	public void view(){
		
	}
	
}
