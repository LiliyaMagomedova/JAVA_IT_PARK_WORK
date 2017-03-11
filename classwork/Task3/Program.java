class Program {
	public static void sort ( int a[]) {
		int temp;
		for (int i=(a.length-1); i>=0; i++) {
			for (int j = 0; j< (a.length-1); j++) {
				if (a[j]> a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {1, 4, 2, 67, -2};
		sort (a);
		for (int i = 0; i<a.length; i++) {
			System.out.print (a[i] + " ");
		}
		
	}
}