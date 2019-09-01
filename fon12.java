public class fon12 {
  public static void main(String args[])
    {
        int fon=5;
        for(int i=1;i<=fon;i++)
	{
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=(fon*2-i);j++)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
   