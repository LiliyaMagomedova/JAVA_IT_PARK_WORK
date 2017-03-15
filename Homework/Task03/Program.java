import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a;
		int b;
		int i = 2;
		int s = 0;
		int p = 1;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		while (a != -1) {
			b = a;
			while (b != 0) {
				s = s + b%10;
				b = b / 10;
			}
			while ((i*i <= s)&&(s % i != 0)) {
					i++;
			}
			if (i*i > s) {
				p = p * a;
			}
			s = 0;
			i = 2;
			a = scanner.nextInt();
		}
		System.out.println (p);
	}
}