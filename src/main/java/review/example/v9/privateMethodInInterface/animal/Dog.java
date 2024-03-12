package review.example.v9.privateMethodInInterface.animal;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("dog bark");
    }
}
