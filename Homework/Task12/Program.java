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

	public static void TurningMatrix (int a[][]) {
		int l = a.length-1;
		int temp1,temp2;
		for (int i = 0; i<a.length/2; i++) {
			for (int j = i; j <l-i; j++) {
				temp1 = a[l-j][i];
				a[l-j][i] = a[i][j];
				temp2 = a[l-i][l-j];
				a[l-i][l-j] = temp1;
				a[i][j] = a [j][l-i];
				a[j][l-i] = temp2;
			}
		}
	}

	public static void main(String[] args) {
		int a[][];
		a = new int [5][5];
		InputMatrix(a);
		TurningMatrix(a);
		System.out.println ("");
		OutputMatrix(a);
	}
}