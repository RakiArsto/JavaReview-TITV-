//Cách gán dữ liệu trong Java
import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.print("Nhap so a = ");
        // Cac phep gan
        a = sc.nextFloat();
        System.out.println("a = "+ a);
        a += 5;
        System.out.println("a += 5 => a = " + a);
        System.out.println("a = "+a);
        a -= 4;
        System.out.println("a -= 4 => a = " + a);
        System.out.println("a = "+a);
        a *= 5;
        System.out.println("a *= 5 => a = " + a);
        System.out.println("a = "+a);
        a /= 6;
        System.out.println("a /= 6 => a = " + a);
        System.out.println("a = "+a);
        a %= 5;
        System.out.println("a %= 5 => a = " + a);
    }
}
