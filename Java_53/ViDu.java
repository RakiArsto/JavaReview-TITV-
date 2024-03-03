//Mảng và cách copy mảng trong Java
import java.util.Arrays;
public class ViDu {
	public static void main(String[] args) {
		//Kiểu nguyên thủy
		int[] mang1 = {1, 2, 3};
		
		//Copy mảng cách 1
		System.out.println("Copy mảng cách 1:");
		int [] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println("Mảng 1: " + Arrays.toString(mang1));
		System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));
		
		//Copy mảng cách 2 - dùng hàm clone
		System.out.println("\nCopy mảng cách 2 - dùng hàm clone:");
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 50;
		System.out.println("Mảng 1_b: " + Arrays.toString(mang1_b));
		
		//Copy mảng cách 3 - dùng hàm System.arraycopy
		System.out.println("\nCopy mảng cách 3 - dùng hàm System.arraycopy:");
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 90;
		System.out.println("Mảng 1_c: " + Arrays.toString(mang1_c));
	}
}
