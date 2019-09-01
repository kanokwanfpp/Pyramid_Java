public class fon36 {
   public static void main(String den[]){
        int fon=3;
        for(int i=1;i<=fon;i++){
            for(int j=i;j<=fon;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            for(int j=fon;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=fon-1;i>=1;i--){
            for(int j=i;j<=fon;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            for(int j=fon;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}