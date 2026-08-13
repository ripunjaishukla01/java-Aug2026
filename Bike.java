class Vehicle {
    int GearsCount;

    void Start(){
System.out.println(" Vehicle is Starting , ready to go!");
    }
}

public class Bike extends Vehicle {
    void Start(){
        System.out.println("Bike is Starting , ready to go! ");
    }
    public static void main(String[] args) {

        Bike obj = new Bike();
        obj.GearsCount = 5;
        obj.Start();
    }
}
