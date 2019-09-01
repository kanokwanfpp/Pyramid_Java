public class fon28 {
  public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            for(int j=fon;j>=i;j--){
                System.out.print(j);
            }
            for(int j=1;j<=P*i-1;j++){
                System.out.print("*");
            }
            for(int j=i;j<=fon;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}