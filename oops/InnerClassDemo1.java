package oops;
public class InnerClassDemo1{
	public static void main(String[] args){
		Pepsi p = new Pepsi();
		Kalimark k = new Kalimark();
		p.makepcola();
		k.makekcola();

	}
}
class Pepsi{
	public void makepcola(){
		Kalimark.Cola cc = new Kalimark().new Cola();
		cc.cola();
		System.out.println("pepsi make cola");
	}
}
class Kalimark{
	public void makekcola(){
		Cola in = new Cola();
		in.cola();
		System.out.println("Kalimark make cola");
	}
	class Cola{
		public void cola(){
			System.out.println("cola make cola");
		}
		public class A{
	
		}
	}
}