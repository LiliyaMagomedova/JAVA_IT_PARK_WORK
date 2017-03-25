package Task6;
public class Sort {

	 public static int[] merge(int a[], int b[]) {
	 	int i = 0;
	 	int j = 0;
	 	int k = 0;
	 	c = new int[100];

		while (k < (a.length + b.length)) {
			if (a[i]<b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}
			else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		for (int y = 0; y< a.length+b.length; y++) {
			System.out.println (c)
		}
		return c; 
	}
}