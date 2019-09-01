public class fon11 {

   public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            for(int j=fon;j>i;j--){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}