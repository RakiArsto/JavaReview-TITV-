//Phân biệt điều khiển public, protected, private
package code;

public class Sub_infor extends Infor {
	public void method() {
		//super.a => không truy cập được
		super.b = 2; //=> truy cập được vì chung 1 gói
		super.c = 3; //=> truy cập được
		super.d = 4; //=> truy cập được
	}
}
