//Ghi đè phương thức-Overriding trong Java
public class Bird extends Animal{
	public Bird() {
		super("Bird");
	}
	public void eat() {
		System.out.println("I eat worms!");
	}
	public void makeSound() {
		System.out.println("Sing");
	}
}