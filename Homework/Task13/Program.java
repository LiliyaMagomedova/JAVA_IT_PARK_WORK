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

	public static int MaxOfColumn (int a[][],int j ) {
		int k = 0;
		int max=a[0][j];
		for (int i = 1; i<a.length; i++) {
			if (max<a[i][j]) {
				max = a[i][j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a[][];
		a = new int [3][3];
		InputMatrix(a);
		for (int j = 0; j<a.length; j++) {
			System.out.println ("Maximum of " + j + " column is "+ MaxOfColumn (a,j));
		}
	}
}