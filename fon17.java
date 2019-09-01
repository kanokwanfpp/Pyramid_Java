public class fon17 {
    public static void main(String den[]){
        int fon=5;
        for(int i=1;i<=fon;i++){
            for(int j=1;j<=fon-1;j++){
                System.out.print(i+""+(fon*2-i));
            }   
            System.out.println();
        }
    }
}