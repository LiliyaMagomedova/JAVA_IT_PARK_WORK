import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a[];
		int i,n;
		int p = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of an array: ");
		n = scanner.nextInt();
		a = new int[n];
		System.out.println("Enter all the elements of the array: ");
		for (i=0; i<n; i++) {
			a[i] = scanner.nextInt();
			if ((a[i]%2==0)&&(i%2==1)) {
				p = p * a[i];
			}
		}
		System.out.print("The product of eve elements on odd positions P = ");
		System.out.println(p);
	}
}