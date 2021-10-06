package polymorphism;

/**
 * Method overriding ->  if two classes have same method with same signature
 *
 * advantage => it allow you to impleme
 */
public class Animal {  //run  time polymorphism ,dynamic binding

    public void sound(int i) {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {

    public static void main(String[] args) {

        Cat obj = new Cat();
        obj.sound(12);
    }

    public void sound(int i) {
        System.out.println("Cat sound");
    }
}