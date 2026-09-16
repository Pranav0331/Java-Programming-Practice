class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // Method overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

public class s1_first {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}