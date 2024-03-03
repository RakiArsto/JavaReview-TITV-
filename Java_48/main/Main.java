//Phân biệt điều khiển public, protected, private
package main;
import code.Infor;
public class Main {
	private Infor infor;
	public void method() {
		//this.infor.a => không truy cập được
		//this.infor.b => không truy cập được vì khác gói
		//this.infor.c => không truy cập được
		this.infor.d = 4; //=> truy cập được
	}
}
