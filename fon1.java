public class fon1 {
	public static void main(String args[]) {
		int totalP = 4;
		for (int fon=1; fon <= totalP; row++) {
			
			for (int col=2; col <= fon; col++) { System.out.print(" "); }
			System.out.print(fon + "" + fon);
			for (int col=totalP; col >= (fon + 1); col--) { System.out.print("**"); }
			System.out.println( row + "" + fon);
		}
	}
}