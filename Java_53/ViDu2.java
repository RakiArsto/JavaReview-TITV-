//Mảng và cách copy mảng trong Java
import java.util.Arrays;
public class ViDu2 {
	public static void main(String[] args) {
		//Kiểu đối tượng
		System.out.println("Mảng đối tượng (Cách 1):");
		String[] mang_doi_tuong = {"Pinterest", ".com"};
		String[] mdt1 = mang_doi_tuong;
		mdt1[0] = "Login";
		System.out.println("Mảng đối tượng: " + Arrays.toString(mang_doi_tuong));
		System.out.println("Mdt1: " + Arrays.toString(mdt1));
		
		System.out.println("\nMảng đối tượng (Cách 2):");
		String[] mdt2 = mang_doi_tuong.clone();
		mdt2[0] = "Wikipedia";
		//System.out.println("Mảng đối tượng: " + Arrays.toString(mang_doi_tuong));
		System.out.println("Mdt2: " + Arrays.toString(mdt2));
		
		System.out.println("\nMảng đối tượng (Cách 3):");
		String[] mdt3 = new String[mang_doi_tuong.length];
		System.arraycopy(mang_doi_tuong, 0, mdt3, 0, mang_doi_tuong.length);
		mdt3[0] = "Youtube";
		//System.out.println("Mảng đối tượng: " + Arrays.toString(mang_doi_tuong));
		System.out.println("Mdt3: " + Arrays.toString(mdt3));
	}
}
