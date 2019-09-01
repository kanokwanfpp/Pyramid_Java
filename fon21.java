public class fon21 {
 public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            for(int j=0;j<=((fon*2)-i+3));j++){
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println((fon*2)-(i+2));
        }
    }
}
    