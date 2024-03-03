//Hiểu rõ về Interface trong Java
public class MayTinhCasioFX500 implements MayTinhBoTuiInterface {
	public double cong(double a, double b) {
		return a + b;
	}
	public double tru(double a, double b) {
		return a - b;
	}
	public double nhan(double a, double b) {
		return a * b;
	}
	public double chia(double a, double b) {
		return (float)a / b;
	}
}
