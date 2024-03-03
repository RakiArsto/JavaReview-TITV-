//Cách kiểm tra và sử lý lỗi biên dịch

//public class Vidu | sinh ra loi la "Lop Vidu la public, nen duoc khai bao trong file co ten ViDu.java"
public class ViDu {
    public static void main(String[] args) {
        //System.out.println(x); loi la "Khong the giai quyet ky hieu x"
        String name = "Kiet";
        System.out.println("Xin chao moi nguoi");
        System.out.println("Toi ten la "+name);
        final int x = 10;
        System.out.println(x);
        //x = 11; Khong the thay doi gia tri cua hang so
    }
}
