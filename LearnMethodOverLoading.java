 class Hello {
    void greeting(){
        System.out.println("Hello");
    }
    void greeting(String name){
        System.out.println("Hello "+name+"Good morning ");  
    }
    void greeting(String name , int count){
        System.out.println("Hello " + name + "Good Morning"+count);
    }
}
public class LearnMethodOverLoading {
public static void main(String[] args) {
    Hello h1 = new Hello();
    h1.greeting();
    h1.greeting("Ripunjai");
    h1.greeting("Ripunjai", 10);
}
    
}