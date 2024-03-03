//Hiểu rõ về Gói - Package trong Java
package main;
import code.ViDu;
public class Main {
	public static void main(String[] args) {
		ViDu vd1 = new ViDu(5, 6);
		System.out.println("a = " + vd1.getA());
		System.out.println("b = " + vd1.getB());
		
		code2.ViDu vd2 = new code2.ViDu(11, 52, 29);
		System.out.println("\na = " + vd2.getA());
		System.out.println("b = " + vd2.getB());
		System.out.println("c = " + vd2.getC());
	}
}
