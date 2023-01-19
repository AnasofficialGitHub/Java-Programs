import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
public class ComparableDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<Student> list = new LinkedList<>();
		list.add(new Student("Anas",2));
		list.add(new Student("Zooho",4));
		list.add(new Student("Suthish",1));
		Collections.sort(list);
		System.out.println(list);
	}
}
class Student implements Comparable<Student>{
	String name;
	int a;
	public Student(String name,float a){
		this.name=name;
		this.a=a;
	}
	public String toString(){
		return name;
	}
	public int compareTo(Student o){
		return this.a-o.a;
	}
}