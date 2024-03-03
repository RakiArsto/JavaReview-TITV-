//Các phép toán cơ bản trong Java
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        //Khai bao bien
        int a, b;
        //Nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        //Tinh tong
        int tong = a + b;
        System.out.println(a+" + "+b+" = "+tong);

        //Tinh hieu
        int hieu = a - b;
        System.out.println(a+" - "+b+" = "+hieu);

        //Tinh tich
        int tich = a * b;
        System.out.println(a+" * "+b+" = "+tich);

        //Tinh thuong
        float thuong = (float)a / b;
        System.out.println(a+" / "+b+" = "+thuong);

        //tinh chia lay du
        int soDu = a % b;
        System.out.println(a+" % "+b+" = "+soDu);
    }
}
