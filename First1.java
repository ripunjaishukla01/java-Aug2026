public class First1 {
    int m = 30;
    int n = 20;

    void add() {

        int x = m + n;
        System.out.println("The added value is : " + x);
    }

    public static void main(String[] args) {
        System.out.println("My file ");
        First1 f1 = new First1();
        f1.add();
        System.out.println("Calling the Third class :");
        Third t1 = new Third();
        t1.fun(10, "Ripunjai Shukla");
    }
}