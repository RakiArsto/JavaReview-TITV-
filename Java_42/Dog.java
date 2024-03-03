//Ghi đè phương thức-Overriding trong Java
public class Dog extends Animal{
	public Dog() {
		super("Dog");
	}
	public void eat() {
		System.out.println("I eat bones!");
	}
	public void makeSound() {
		System.out.println("Woof woof");
	}
}