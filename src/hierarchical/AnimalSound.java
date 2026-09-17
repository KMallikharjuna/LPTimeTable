package hierarchical;

import java.util.Scanner;

public class AnimalSound {
	public AnimalSound(Animal obj) {
		obj.sound();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the animal name (cat, cow, dog)");
		String animal = scan.next();
		Animal anim = new Animal();
		switch(animal.toLowerCase()) {
		case "dog": anim = new Dog(); break;
		case "cat": anim = new Cat(); break;
		case "cow": anim = new Cow(); break;
		}
		
		AnimalSound as = new AnimalSound(anim);
	}
}
