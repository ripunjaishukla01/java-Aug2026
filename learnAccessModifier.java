class Student {

    private int age = 20;
    int rollNo = 101;

    protected String name = "Rahul";

    public void display() {
        System.out.println("Hello");
    }
}

public class learnAccessModifier {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.rollNo);
        System.out.println(s.name);
        s.display();
    }
}