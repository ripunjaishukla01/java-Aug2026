abstract class Class1 {
    public void method1(){
       System.out.println(" I am Method1 ");
    }
    public void  method2(){
        System.out.println("I am Method 2");
    }
    private int var1 = 25;
    private String var2 = "Ripunjai";
    public int getvar1(){
         return var1;
    }public String getvar2(){
      return var2;
    }
}
public class  ClassNew1 extends Class1 {
      public static void main(String[] args) {
        ClassNew1 c1 = new ClassNew1();
       c1.method1();
       c1.method2();
        System.out.println("Date of birth "+c1.getvar1());
        System.out.println("My name is : "+c1.getvar2());

       
      } 
    }



    