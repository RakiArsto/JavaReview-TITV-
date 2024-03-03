//Vì sao không có đa kế thừa trong Java?
public class NguoiMy extends ConNguoi {
	public NguoiMy(String hoVaTen, int namSinh) {
		super(hoVaTen, namSinh);
	}
	public void xinChao() {
		System.out.println("Hello");
	}
}
