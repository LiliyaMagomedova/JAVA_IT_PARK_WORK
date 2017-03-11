class Program {
	public static int sum ( int a, int b) {
		int result = 0;
		while (a<=b) {
			result = result + a;
			a++;
		}
		return result;
	}

	public static void main(String[] args) {
		int s;
		int a = 1;
		int b = 5;
		s = sum (a,b);
		System.out.println (s);
	}
}