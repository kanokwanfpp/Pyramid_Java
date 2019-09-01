public class fon5 {
    public static void main(String den[]){
        int totalP=4;
        for(int i=1;P<=totalP;i++){
            for(int col=totalP-1;col>=i;col--){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int col=1;col<i;col++){
                System.out.print("**");
            }
            System.out.println(i);
        }
        for(int i=1;i<totalP;i++){
            for(int col=1;col<=i;col++){
                System.out.print(" ");
            }
            System.out.print(totalP-i);
            for(int col=totalP-1;col>i;col--){
                System.out.print("**");
            }
            System.out.println(totalP-i);
        }
    }
}