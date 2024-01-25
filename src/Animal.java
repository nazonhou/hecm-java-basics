public abstract class Animal {
    String name;

    void presentation() {
        System.out.println(name + " sound is " + sound());
    }

    abstract String sound();
}
