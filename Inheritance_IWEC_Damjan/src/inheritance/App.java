package inheritance;

public class App {
    public static void main(String[] args) {
        Student s = new Student("Pero", "Perov", 98);

        System.out.println(s.toString());

        Monitor m = new Monitor();
        m.print();

        TV tv = new TV();
        tv.print();
    }
}
