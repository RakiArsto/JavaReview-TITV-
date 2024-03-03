//Lớp Math và các hàm toán học trong Java
import java.util.Scanner;
public class btHinhTron {
    public static void main(String[] args) {
        //Công thức tính ChuViHinhTron: 2*PI*R
        //Công thức tính DienTichHinhTron: PI*R^2
        double r;
        double chuVi, dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị bán kính r: ");
        r = sc.nextDouble();

        chuVi = 2 * Math.PI * r;
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Làm tròn chu vi: " + Math.round(chuVi));
        System.out.println("Diện tích hình tròn là: " + dienTich);
        System.out.println("Làm tròn diện tích: " + Math.round(dienTich));
    }
}
