//Hiểu rõ hàng đợi Queue và Deque trong Java
package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		
		danhSachSV.offer("Nguyễn Vũ Tuấn Kiệt");
		danhSachSV.offer("Trần Thanh Hoàng");
		danhSachSV.offer("Hoàng Quốc Kỳ");
		danhSachSV.offer("Mai Thanh Bình");
		
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
