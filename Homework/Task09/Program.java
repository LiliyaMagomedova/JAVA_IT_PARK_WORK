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

	public static int MinOfString (int a[][],int i ) {
		int k = 0;
		int min=a[i][0];
		for (int j = 1; j<a[i].length; j++) {
			if (min>a[i][j]) {
				min = a[i][j];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int a[][];
		a = new int [3][3];
		InputMatrix(a);
		for (int i = 0; i<a.length; i++) {
			System.out.println ("Minimum of " + i + " string is "+ MinOfString (a,i));
		}
	}
}