//Các phép toán so sánh và điều kiện trong Java
import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap gia tri a: ");
        a = sc.nextInt();
        System.out.print("Nhap gia tri b: ");
        b = sc.nextInt();

        //Xuat ket qua so sanh
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println("------------");
        System.out.println("Ca hai gia tri la so chan: " + (a % 2 == 0 && b % 2 == 0));
        System.out.println("Mot trong hai gia tri la so chan: " + (a % 2 == 0 || b % 2 == 0));
    }
}
