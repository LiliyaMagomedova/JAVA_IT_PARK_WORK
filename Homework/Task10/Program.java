import java.util.Scanner;

class Program {

	public static void InputMatrix (int a[][]) {
		Scanner scanner = new Scanner (System.in);
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j< a[i].length; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
	}

	public static void OutputMatrix (int a[][]) {
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j< a[i].length; j++) {
				System.out.print (a[i][j] + " ");
			}
			System.out.println ();
		}		
	}

	public static void ZeroingOfMainDiag (int a[][]) {
		int i = 0;
		while (i<a.length) {
			a[i][i] = 0;
			i++;
		}
	}

	public static void main(String[] args) {
		int a[][];
		a = new int [3][3];
		InputMatrix(a);
		ZeroingOfMainDiag(a);
		System.out.println ("");
		OutputMatrix(a);
	}
}