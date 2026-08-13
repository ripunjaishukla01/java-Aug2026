//   StringReverse
  
  public class StringReverse{
    public static void main(String[] args) {
        //  String arr[] = {"Ripunjai","Thor","Ironman","Hulk"};
         String name = "Ripunjai Shukla";
         String rev= " ";
         for (int i = name.length()-1 ; i>(-1); i--){
          rev =  rev + name.charAt(i);
         }
         System.out.print(rev);        
    }
}



// public class StringReverse{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         for (int i = 0; i < arr.length; i++) 
//         for (int j = 1; j < i; j++) {
                
        
//             System.out.println(arr[j]);
//         }
//     } 
// }