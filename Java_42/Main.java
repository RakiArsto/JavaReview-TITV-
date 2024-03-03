//Ghi đè phương thức-Overriding trong Java
public class Main {
	public static void main(String[] args) {
		System.out.println("Kiểm tra chó: ");
		Dog d = new Dog();
		d.eat();
		d.makeSound();
		d.sleep();
		
		System.out.println("---- ");
		System.out.println("Kiểm tra mèo: ");
		Cat c= new Cat();
		c.eat();
		c.makeSound();
		c.sleep();
		
		System.out.println("---- ");
		System.out.println("Kiểm tra chim: ");
		Bird b= new Bird();
		b.eat();
		b.makeSound();
		b.sleep();
		
	}
}
