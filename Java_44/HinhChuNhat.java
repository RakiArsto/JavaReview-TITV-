//Lớp và phương thức trừu tượng abstract trong Java
public class HinhChuNhat extends Hinh {
	private double chieuRong;
	private double chieuCao;

	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	public double tinhDienTich() {
		return this.chieuRong * this.chieuCao;
	}
}