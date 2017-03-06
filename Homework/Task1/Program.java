import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a;
		int i = 2;
		int p = 1;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		while (a != -1) {
			while ((i*i <= a)&&(a % i != 0)) {
					i++;
			}
			if (i*i > a) {
				p = p * a;
			}
			i = 2;
			a = scanner.nextInt();
		}
		System.out.println (p);
	}
}