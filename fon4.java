public class fon4 {
   public static void main(String args[])
    {
        int totalP=4;
        for(int i=1;i<=totalP;i++)
	{
            for(int col=1;col<=i;col++)
	    {
                System.out.print("*");
            }
            for(int col=i;col>=1;col--)
	    {
                System.out.print(col);
            }
            for(int col=1;col<i;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}
