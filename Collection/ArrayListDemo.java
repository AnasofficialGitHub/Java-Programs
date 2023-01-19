import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
@SuppressWarnings("unchecked")
public class ArrayListDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<Student> arr=new ArrayList();
		System.out.println("Enter the number of students");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter the name : ");
			String name=scan.next();
			System.out.println("Roll No. : ");
			int roll=scan.nextInt();
			arr.add(new Student(name,roll));
		}
		arr.add(0,new Student("suthish",32));
		
		//System.out.println(arr.get(0));
		arr.get(1).name="Anas";
		Iterator it = arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(int i=0;i<n;i++){
			if(arr.contains(54)){
				System.out.println(arr.get(i));
			}
		}
	}
}
class Student{
	String name;
	int rollno;
	public Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getRollno(){
		return rollno;
	}
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	public String toString(){
		return name+" "+rollno;
	}
}