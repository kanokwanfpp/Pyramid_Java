public class fon27 {
  public static void main(String args[])
    {
        int fon=5;
        for(int i=1;i<=fon;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}