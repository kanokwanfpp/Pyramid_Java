public class fon25 {
  public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            for(int j=i;j<fon;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(fon-i+1);
            }
            for(int j=i;j<=fon;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}