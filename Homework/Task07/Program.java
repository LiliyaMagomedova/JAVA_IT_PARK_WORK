import java.util.Scanner;
class Program {
	
	public static void InputArray (int n, int a[]) {
		System.out.println("Enter all the elements of the array: ");
		Scanner scanner = new Scanner (System.in);
		for (int i = 0; i< n; i++) {
			a[i] = scanner.nextInt();
		}
	}

	public static int LocalMaximum(int a[]) {
		int NumberOfLocalMax = 0;
		System.out.print("Local maxima: ");
		for (int i = 1; i < (a.length-1); i++) {
			if ((a[i]>a[i-1])&&(a[i]>a[i+1])) {
				System.out.print (a[i]+" ");
				NumberOfLocalMax++;
			}
		}
		System.out.println("");
		return NumberOfLocalMax;
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter length of an array: ");
		n = scanner.nextInt();
		int a[] = new int[n];
		InputArray (n, a);
		System.out.println ("The number of maxima is " + LocalMaximum (a));
	}
}