class Hello {

    void  greeting(){
        System.out.println("Ripunjai");
    }
    void greeting(String name){
         System.out.println("Hello "+name+" Good Morning");
    }
    void greeting(String name , int count){
        for(int i = 0;i<count;i++){
        System.out.println("hello"+name+ "Good Morning");
    }}
}
public class MethodOverloading{
    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.greeting();
        h1.greeting("Ripunjai Shukla");
        h1.greeting("Ripunajai ", 5);
    }
}