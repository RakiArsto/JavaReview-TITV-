//Cách sử dụng câu lệnh break, continue và return trong Java
public class ViDu3 {//Lệnh Continue
	//Tình huống không sử dụng lable
	public static void main(String[] args) {
		int max = 100;
		for(int i = 0; i < max; i++) {
			if(i < 50) {
				continue;
			}
			System.out.println(i);
		}
	}
}
