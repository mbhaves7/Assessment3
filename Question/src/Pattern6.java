
public class Pattern6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
//-------------------------------------------------------		
		System.out.println("\n");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		// ------------------------------------------------------------
		System.out.println("\n");
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
//			i++;
			System.out.println();
		}
		System.out.println("\n");
//-----------------------------------------------------------------------
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// --------------------------------------------------------------
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ------------------------------------------------------
		System.out.println("\n");

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
//---------------------------------------------------------------------
		System.out.println("\n");

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("\n");

//----------------------------------------------------------
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
//-----------------------------------------------------------
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
