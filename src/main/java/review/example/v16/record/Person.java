package review.example.v16.record;

public record Person(String name, int age) {
    public static String address;

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

class Test {
    public static void main(String[] args) {
        Person person = new Person("user", 18);
        System.out.println(person.age());
        System.out.println(person.name());
        person.sayHello();
        System.out.println(person);
        System.out.println(person.hashCode());
        System.out.println(person);
    }
}

