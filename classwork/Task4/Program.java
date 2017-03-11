import java.util.Random;
class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		int amount [] = new int [121];
		Random random = new Random();
		int s = 0;
		for(int i = 0; i < amount.length; i++) {
			amount[i] = 0;
		}

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
			amount [ages[i]] +=1;
		}

		for(int i = 0; i < 100; i++) {
			System.out.println(ages[i]);
		}


		for(int i = 0; i < amount.length; i++) {
			s += amount[i];
			System.out.println(i +" age  - " + amount[i] + " people");
		}
		System.out.println(s);
		// вывести на экран количество людей, с возрастами от 0 до 120
		

	}
}