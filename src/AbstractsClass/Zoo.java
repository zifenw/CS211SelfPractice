package AbstractsClass;
import java.util.*;

abstract class Animal{
	private String name;
	public Animal(String name) {  //constructor
		this.name = name;
	}
	public String getName() {
		return name;
	}
	// abstract method, subclasses must implement 
    public abstract void makeSound();
}

class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + " roars!");
	}
}

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets!");
    }
}

public class Zoo {
	private List<Animal> animals;
	
	public Zoo(){
		this.animals = new ArrayList<>();
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public void performDailyRoutine() {
		System.out.println("Good morning! It's time for the animals to make some noise.");
		for(Animal animal : animals) {
			animal.makeSound();
		}
	}
	public static void main(String[] args) {
		Zoo zoo = new Zoo();

        Lion lion = new Lion("Leo");
        Elephant elephant = new Elephant("Ellie");

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.performDailyRoutine();

	}

}



