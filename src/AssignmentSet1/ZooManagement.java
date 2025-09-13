package AssignmentSet1;

interface Animal {
    void makeSound();
    void eat();
}

class Lion implements Animal {
    public void makeSound() {
        System.out.println("Lion: Roar!");
    }
    public void eat() {
        System.out.println("Lion eats meat.");
    }
}

class Elephant implements Animal {
    public void makeSound() {
        System.out.println("Elephant: Trumpet!");
    }
    public void eat() {
        System.out.println("Elephant eats grass and fruits.");
    }
}

class Monkey implements Animal {
    public void makeSound() {
        System.out.println("Monkey: Screech!");
    }
    public void eat() {
        System.out.println("Monkey eats bananas.");
    }
}

public class ZooManagement {
    public static void main(String[] args) {
        Animal[] zoo = {new Lion(), new Elephant(), new Monkey()};

        System.out.println("=== ZOO MANAGEMENT SYSTEM ===");
        for (Animal a : zoo) {
            a.makeSound();
            a.eat();
            System.out.println();
        }
    }
}
