//Chuyển đổi kiểu dữ liệu trong Java
public class ViDu {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        //Ép kiểu ngầm định
        float c = a; // hoặc float c = (float)a
        float d = b; // hoặc float d = (float)b
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        //Ép kiểu tường minh
        float e = 15.5f;
        float f = 30.5f;
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        int g = (int)e;
        int h = (int)f;
        System.out.println("g = "+g);
        System.out.println("h = "+h);
        //Ép kiểu giữa biến nguyên thủy và đối tượng
        int x = new Integer(32); //"Integer(int)" không được dùng kể từ phiên bản 9 và được đánh dấu để xóa
        System.out.println("x = "+x);
    }
}
