//Ghi đè phương thức-Overriding trong Java
public class Cat extends Animal{
	public Cat() {
		super("Cat");
	}
	public void eat() {
		System.out.println("I eat fish!");
	}
	public void makeSound() {
		System.out.println("Meow meow");
	}
}