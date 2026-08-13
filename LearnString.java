public class LearnString {
    public static void main(String[] args) {
        String name = "Ripunjai";
        String samename = "Ripunjai";
        String  newname = new String("ripunjai");
        System.out.println(name);
        System.out.println(newname);
        if (name==samename) {
            System.out.println("Both are same");
        }
        if (name==newname) {
           System.out.println("Both are same"); 
        }else{
            System.out.println("Both are not same");
        }
        if (name.equalsIgnoreCase(newname)) {
            System.out.println("both are same name");
        }
    }
}
