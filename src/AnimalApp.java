
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal(); // calling class a from parent class
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat(); // calling class c from parent class
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird(); // calling class b from parent class
		print(b.eat());
		print(b.sleep());
		print(b.fly());

		Dog d = new Dog();
		print(d.sleep());
		print(d.eat());
		print(d.bark());

	}
	private static void print(String s){
		System.out.println(s);
	}
}
