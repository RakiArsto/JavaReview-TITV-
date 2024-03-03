//Vì sao không có đa kế thừa trong Java?
public class Main {
	public static void main(String[] args) {
		NguoiVietNam nvn = new NguoiVietNam("Kiệt", 2004);
		NguoiMy nm = new NguoiMy("John", 1999);
		NguoiBaLan nbl = new NguoiBaLan("Tomek", 2000);
		nvn.xinChao();
		nm.xinChao();
		nbl.xinChao();
	}
}
