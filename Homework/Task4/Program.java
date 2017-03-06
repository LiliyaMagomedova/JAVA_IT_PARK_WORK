import java.util.Scanner;
class Program {

	public static void output (int a[]) {
		for (int i=0; i<a.length; i++) {
			System.out.print (a[i]);
			System.out.print (' ');
			}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[];
		int i,n,buf;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		a = new int[n];
		for (i=0; i<n; i++) {
			a[i] = scanner.nextInt();
		}
		output(a);
		for (i=0; i<(n/2); i++) {
			buf = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = buf;
		}
		output (a);
	}
}