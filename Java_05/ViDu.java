//Kiểu dữ liệu trong Java
public class ViDu {
    public static void main(String[] args) {
        String tenSach = "Năng lực tìm kiếm";
        int namXuatBan = 2020;
        double giaTien = 155.5;
        boolean conSach = true;
        char maKho = 'H';
        System.out.println("Sách có tên là: "+tenSach);
        System.out.println("Được đề xuất vào năm "+namXuatBan);
        System.out.println("Với trị giá "+giaTien+" nghìn đồng");
        /*if(conSach == true){
            System.out.println("Hiện tại vẫn còn sách");
        }
        else{
            System.out.println("Hiện tại đã hết sách");
        }*/
        System.out.println("Hiện tại vẫn còn sách: "+ conSach);
        System.out.println("Mã kho của sách là "+maKho);
    }

}
