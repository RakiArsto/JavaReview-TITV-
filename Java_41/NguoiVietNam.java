//Vì sao không có đa kế thừa trong Java?
public class NguoiVietNam extends ConNguoi {
	public NguoiVietNam(String hoVaTen, int namSinh) {
		super(hoVaTen, namSinh);
	}
	public void xinChao() {
		System.out.println("Xin chào");
	}
}
