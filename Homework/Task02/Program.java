import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a;
		int i = 1;
		int s = 0;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		while (a != -1) {
			if (i % 2 == 0) {
				s = s + a;
			}
			a = scanner.nextInt();
			i++;
		}
		System.out.println (s);
	}
}