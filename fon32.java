public class fon32 {
   public static void main(String args[])
    {
        int fon=3;
        for(int i=1;i<=fon*2-1;i++)
	{
            for(int j=1;j<=(fon*2-i+2);j++)
	    {
                System.out.print(j);
            }
            for(int j=fon;j<=fon+i+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println(fon-(fon-2)+i);
        }
    }
}