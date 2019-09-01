public class fon33 {
  public static void main(String den[]){
        int fon=3;
            for(int i=1;i<=fon;i++){
                for(int j=i;j<=fon+1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i<fon;i++){
                for(int j=1;j<=i+2;j++){
                    System.out.print(" ");
                }
                for(int j=i;j<=(fon-1)*2-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
       
    }
}
   