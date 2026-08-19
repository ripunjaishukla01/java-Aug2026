public class HousePattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 23; i++) {
            for (int j = 1; j <= 40; j++) {



                p(i>=1&&i<=11?i==1&&j>=11&&
                    j<=30?"-":i>1&&(12-i)==j?"/"
                    :i>1&&(29+i)==j?"\\":i<11&&
                    (10+i)==j?"\\":(12-i)<=j&&
                    (10+i)>=j?"s":(10+i)<=j&&(29
                     +i)>=j?"Y":"":i<=16?j==1||
                     j==21||j==40?"|":"#":j==1||
                     j==21||j==40?"|":j<-6||
                     j>-15&&j<-21?"@":j==-7||
                     j==14?"|":j==22||j==39?
                     "@":i<=20?
                     ":":" ");
                     }    
                     p("\n");
        
                       }}
                       static void p(String a){
                         System.out.print(a);
                }}