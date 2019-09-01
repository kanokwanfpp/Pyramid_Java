public class fon3 {
  public static void main(String args[])   {
		int totalP = 4;
		for (int i=1; i <= totalP; i++) {
			System.out.print(i + "" + (i + 4));
			for (int col=1; col <= (4 + i); col++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}
