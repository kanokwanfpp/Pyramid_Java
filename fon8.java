public class fon8 {
  public static void main(String args[])
    {
        int fon=7;
        for(int i=1;i<=fon;i++)
	{
            for(int j =1;j<i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(i+""+(i+1)+""+(i+2));
            for(int j=0;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
  