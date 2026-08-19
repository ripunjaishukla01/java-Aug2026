public class SubcClass {
   
    public class InnerSubcClass {
         private int num = 10;
         
         public int getValue(){
            int n = num;
            return n;
         }
    }

    public static void main(String[] args) {
        SubcClass s1 = new SubcClass();
        SubcClass.InnerSubcClass Insc1 = s1.new InnerSubcClass();

        System.out.println(Insc1.getValue());
    }
}
