package day44_InterfaceIntro.animal;

public final class Eagle extends Animal {
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println( getName()+ " eats snake");
    }
}
