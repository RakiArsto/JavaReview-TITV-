//Cách xây dựng lớp và phương thức khởi tạo Constructor
public class Main {
	public static void main(String[] args) {
		int d;
		MyDate md = new MyDate(5, 10, 2021);
		md.printDay();
		md.printMonth();
		md.printYear();
		md.printDate();
	}
}
