//Cách phân tách chuỗi thành mảng trong Java
package vidu;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s = "Xin chào các bạn, tôi là Kiệt";
		
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chào, mình là Kiệt. Mình là lập trình viên!";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Nguyễn Vũ Tuấn Kiệt";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Tên: " + d[d.length - 1]);
	}
}
