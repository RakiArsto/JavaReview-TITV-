//Xây dựng phương thức so sánh compareTo và hiểu rõ về Comparable trong Java
package vidu;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Nguyễn Vũ Tuấn Kiệt", "22DTH1", 9);
		SinhVien sv2 = new SinhVien(100, "Dương Hoàng Thái Huy", "22DTH2", 8);
		SinhVien sv3 = new SinhVien(199, "Trần Thanh Hoàng", "22DTH3", 7);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
	}
}
