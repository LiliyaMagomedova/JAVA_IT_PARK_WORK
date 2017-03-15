import java.util.Scanner;
class Program {
	
	public static int SumOfDigits (int a) {
		int s = 0;
		while (a != 0) {
			s = s + a%10;
			a = a / 10;
		}
		return s;
	}

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println ("Sum = " + SumOfDigits(a));
	}
}