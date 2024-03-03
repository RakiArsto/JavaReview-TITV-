//Cách sử dụng câu lệnh break, continue và return trong Java
public class ViDu4 {//Lệnh Continue
	//Tình huống sử dụng lable
	public static void main(String[] args) {
		loop: for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j > 5) {
					continue loop;
				}
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("----------");
		}
	}
}