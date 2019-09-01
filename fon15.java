public class fon15 {
   public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            for(int j=i;j<=fon;j++){
                System.out.print(i);
            }
            for(int j=1;j<=(i*2-1);j++){
                System.out.print(" ");
            }
            for(int j=i;j<=fon;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}