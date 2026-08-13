class Animal {
    void eats() {
        System.out.println("Animal is eating...");
    }
}
    class Dog extends Animal {
        @Override
        void eats() {
          System.out.println("Dog is barking...");
        
    }
}


public  class Example1  {
public static void main(String[] args) {
    
    Dog d = new Dog();
    d.eats();
    
}
}