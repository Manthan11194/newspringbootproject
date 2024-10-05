package Interface_Abstract;
//Interface Animal
interface Animal {
 // Abstract method (no body)
 void makeSound();
}
class Dog implements Animal {
 
 @Override
 public void makeSound() {
     System.out.println("Dog says: Woof Woof");
 }
}

class Cat implements Animal {

 @Override
 public void makeSound() {
     System.out.println("Cat says: Meow Meow");
 }
}
public class Main {
		 public static void main(String[] args) {
		       
		        Animal dog = new Dog();
		        Animal cat = new Cat();
     
		        dog.makeSound();  
		        cat.makeSound();  
		    }
}

