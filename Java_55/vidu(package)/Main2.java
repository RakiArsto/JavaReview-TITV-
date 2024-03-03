//Tìm kiếm, sắp xếp, copy mảng bằng các hàm có sẵn trong Java
package vidu;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Nguyễn Vũ Tuấn Kiệt", "22DTH1", 9);
		SinhVien sv2 = new SinhVien(100, "Dương Hoàng Thái Huy", "22DTH2", 8);
		SinhVien sv3 = new SinhVien(199, "Nguyễn Phương Thùy An", "22DTH3", 7);
		SinhVien sv4 = new SinhVien(199, "Mai Thanh Bình", "22DTH3", 8);
		
		SinhVien[] a_sv = new SinhVien[] {sv1, sv2, sv3, sv4};
		
		System.out.println("Ban đầu: " + Arrays.toString(a_sv));
		
		//Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi sắp xếp: " + Arrays.toString(a_sv));
		
		//Hàm tìm kiếm
		System.out.println("Tìm kiếm An: " + Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm Bình: " + Arrays.binarySearch(a_sv, sv4));
	}
}
