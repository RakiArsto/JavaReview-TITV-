//Lớp Math và các hàm toán học trong Java
import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        a = sc.nextDouble();
        System.out.print("Nhập giá trị b: ");
        b = sc.nextDouble();

        //Giá trị tuyệt đối
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("|b| = " + Math.abs(b));
        System.out.println(""); //Hoặc System.out.print("\n");
        //Giá trị min
        System.out.println("Giá trị nhỏ nhất là: " + Math.min(a, b));
        //Giá trị max
        System.out.println("Giá trị lớn nhất là: " + Math.max(a, b));
        //Giá trị ceil
        System.out.println("Ceil của a là: " + Math.ceil(a));
        System.out.println("Ceil của b là: " + Math.ceil(b));
        //Giá trị floor
        System.out.println("Floor của a la: " + Math.floor(a));
        System.out.println("Floor của b la: " + Math.floor(b));
        //Căn bậc hai
        System.out.println("Căn bậc hai của a là: " + Math.sqrt(a));
        System.out.println("Căn bậc hai của b là: " + Math.sqrt(b));
        //Mũ
        System.out.println("a mũ b bằng " + Math.pow(a, b));
    }
}
