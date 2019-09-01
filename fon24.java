public class fon24 {
   public static void main(String args[])
    {
        int fon=5;
        for(int i=1;i<=fon;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=i;j<=fon*2-i;j++)
	    {
                System.out.print(i);
            }
	    System.out.print(i);
            System.out.println();
        }
    }
}