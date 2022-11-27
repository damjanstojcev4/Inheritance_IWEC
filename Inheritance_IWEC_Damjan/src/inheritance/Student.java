package inheritance;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int points;

    public Student(String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(points);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return this.points == other.points;
        }

    @Override
    public String toString() {
        TV tv = new TV();
        tv.someMethod();

        return "[firstName=" + firstName + ", lastName=" + lastName + ", points=" + points + "]";
    }
}


