//Phân biệt điều khiển public, protected, private
package main;
import code.Infor;
public class Sub_infor2 extends Infor {
	public void method() {
		//super.b => không truy cập được vì khác gói
		super.c = 3; //=> truy cập được
		super.d = 4; //=> truy cập được
	}
}
