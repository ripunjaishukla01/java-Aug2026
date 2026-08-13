public class LearnThis {
    private String model;
    private int year;

    public LearnThis(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Car: " + this.model + " (" + this.year + ")");
    }

    public static void main(String[] args) {
        LearnThis car1 = new LearnThis("Scorpio", 2026);
        LearnThis car2 = new LearnThis("Fortuner", 2025);
        car1.display();
        car2.display();

    }
}
