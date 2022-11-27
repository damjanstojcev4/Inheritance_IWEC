package inheritance;

public class Monitor {
    protected boolean on;

    public void print() {
        System.out.println();
        System.out.println("Ova e implementacija na Monitor");
        someMethod();
    }
    protected void someMethod() {
        System.out.println("initial values");
    }
}
