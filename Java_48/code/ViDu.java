//Phân biệt điều khiển public, protected, private
package code;

public class ViDu {
	private Infor infor;
	public void method() {
		//this.infor.a => không truy cập được
		this.infor.b = 2; //truy cập được vì chung 1 gói
		this.infor.c = 3; //truy cập được
		this.infor.d = 4; //truy cập được
	}
}
