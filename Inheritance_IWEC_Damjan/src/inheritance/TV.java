package inheritance;

public class TV extends Monitor {

    @Override
    public void print() {
        System.out.println();
        System.out.println("Ova e implementacija od TV");
        System.out.println(this.on);
        someMethod();
    }
}
