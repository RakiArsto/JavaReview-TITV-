//Vì sao không có đa kế thừa trong Java?
public class NguoiBaLan extends ConNguoi{
	public NguoiBaLan(String hoVaTen, int namSinh) {
		super(hoVaTen, namSinh);
	}
	public void xinChao() {
		System.out.println("Cześć");
	}
}
