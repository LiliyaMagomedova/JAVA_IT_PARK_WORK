import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a [] = {1, 2, 3, 4, 5};
		int i,p=-1;
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for (i = 0; i<a.length; i++) {
			if (x == a[i]) {
				p = i;
			}
		}
	
		System.out.println(p);
	}
}