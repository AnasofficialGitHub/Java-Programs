import java.util.Scanner;
public class AreaPerimeterCircle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r, p=3.14159265358979323846264338327950288419716939937510, area, perimeter;
		System.out.println("Radius : ");
		r=scan.nextDouble();
		area = p*r*r;
		perimeter=2*p*r;
		System.out.println("Area is = "+area);
		System.out.println("Perimeter is = "+perimeter);
	}
}
		