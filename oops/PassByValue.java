package oops;
public class PassByValue{
	
	public static void main(String[] args){
		PassByValue obj = new PassByValue();
		obj.met(20);
		
	}
	public void met(int i){
		i=i+10;
		System.out.println("Hello "+i);
		met1("hello",i);
	}
	public void met1(String s, int i){
		System.out.println(s+" "+i);
	}
}