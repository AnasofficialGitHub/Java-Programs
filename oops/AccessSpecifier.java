package oops;
public class AccessSpecifier{
	int nomod;
	public int pub;
	private int pri;
	protected int pro;
	public void met(){
		System.out.println(nomod);
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
	}
}
class Child extends AccessSpecifier{
	public void met1(){
		
		System.out.println(nomod);		
		System.out.println(pub);
		//System.out.println(pri);
		System.out.println(pro);
	}
}
class NosameClass{
	public void met2(){
		AccessSpecifier obj = new AccessSpecifier();
		System.out.println(obj.nomod);
		System.out.println(obj.pub);
		//System.out.println(obj.pri);
		System.out.println(obj.pro);
	}
}