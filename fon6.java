public class fon6 {
  public static void main(String args[])
    {
        int fon=7;
        for(int i=fon;i>=1;i--)
        { 
            for(int j=fon;j>i;j--)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print((j%2));
            }
            System.out.println();
        }
    }
}
    