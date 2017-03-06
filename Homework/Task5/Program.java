import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a[];
		int i,n;
		int s = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of an array: ");
		n = scanner.nextInt();
		a = new int[n];
		System.out.println("Enter all the elements of the array: ");
		for (i=0; i<n; i++) {
			a[i] = scanner.nextInt();
			s = s + a[i];
		}
		System.out.print("The sum of the elements S = ");
		System.out.println(s);
	}
}