import java.util.Scanner;

class Program {

	public static boolean IfSimple (int a) {
		int i = 2;;
		while ((i*i <= a)&&(a % i != 0)) {
			i++;
		}
		return (i*i > a);
	}

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println (IfSimple(a));

	}
}