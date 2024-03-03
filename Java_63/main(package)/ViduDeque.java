//Hiểu rõ hàng đợi Queue và Deque trong Java
package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViduDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		
		danhSachSV.offer("Nguyễn Vũ Tuấn Kiệt");
		danhSachSV.offer("Trần Thanh Hoàng");
		danhSachSV.offer("Hoàng Quốc Kỳ");
		danhSachSV.offer("Mai Thanh Bình");
		danhSachSV.offerLast("Nguyễn Hoài Nam");
		danhSachSV.offerFirst("Nguyễn Vũ Lâm");
		
		while(true) {
			String ten = danhSachSV.poll(); //=> lấy ra và xóa
			if(ten == null) {
				break;
			}
			//peek() => lấy ra nhưng không xóa
			System.out.println(ten);
		}
	}
}
