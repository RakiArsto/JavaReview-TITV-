//Cách nhập dữ liệu từ bàn phím
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho va ten: ");
        String hoVaTen = sc.nextLine();

        System.out.print("Nhap ma sinh vien: ");
        long maSinhVien = sc.nextLong();

        System.out.print("Nhap diem thi: ");
        float diemThi = sc.nextFloat();

        System.out.println("Ho va Ten: "+hoVaTen);
        System.out.println("Ma sinh vien: "+maSinhVien);
        System.out.println("Diem thi: "+diemThi);
    }
}

