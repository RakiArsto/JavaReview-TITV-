//Tìm kiếm, sắp xếp, copy mảng bằng các hàm có sẵn trong Java
package vidu;

import java.util.Arrays;

public class Main {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	public static void main(String[] args) {
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9, 5};
		int[] b = new int[15];
		
		System.out.println("a ban đầu: \n" + Arrays.toString(a));
		
		//Hàm sắp xếp tăng dần
		System.out.println("\nHàm sắp xếp tăng dần:");
		Arrays.sort(a);
		System.out.println("a sau khi sắp xếp: \n" + Arrays.toString(a));
		
		//Hàm tìm kiếm
		System.out.println("\nHàm tìm kiếm:");
		System.out.println("Tìm kiếm số 4: " + Arrays.binarySearch(a, 4));
		System.out.println("Tìm kiếm số -1: " + Arrays.binarySearch(a, -1));
		
		//Hàm điền giá trị
		System.out.println("\nHàm điền giá trị:");
		Arrays.fill(b, 5);
		System.out.println("b sau khi điền giá trị: \n" + Arrays.toString(b));
		
		//Hàm sắp xếp giảm dần
		System.out.println("\nHàm sắp xếp giảm dần:");
		Arrays.sort(a);
		a = Main.reverse(a);
		System.out.println("a sau khi sắp xếp giảm dần: \n" + Arrays.toString(a));
	}
}
