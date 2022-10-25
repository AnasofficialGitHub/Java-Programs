package oops;
public class InnerClassDemo{
	public static void main(String[] args){
		Outer out = new Outer();
		Outer.Inner in = new Outer().new Inner();
		//in.innermet();
		Outer1.Inner1 sin = new Outer1.Inner1();
		sin.innermet1();
	}
}
class Outer{
	private String money="Hundred";
	public void outermet(){
		new Inner().innermet();
		System.out.println("outer method "+new Inner().innermoney);
	}
	class Inner{
		private String innermoney="Two Hundred";
		private void innermet(){
			System.out.println("inner method "+money);
		}
	}
}
class Outer1{
	private static String money1="thousand";
	private static void outermet1(){
		System.out.println("outer static method");
	}	
	static class Inner1{
		public void innermet1(){
			outermet1();
			System.out.println("static inner class method"+money1);
		}
	}
}