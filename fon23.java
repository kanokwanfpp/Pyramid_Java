public class fon23 {
 public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            System.out.print(i);
            for(int j=i;j<=fon+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}