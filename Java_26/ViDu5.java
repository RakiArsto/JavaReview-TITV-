//Cách sử dụng câu lệnh break, continue và return trong Java
public class ViDu5 {//Lệnh return
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i > 5) {
					return;
				}
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("----------");
		}
	}
}
