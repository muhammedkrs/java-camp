
public class Main {

	public static void main(String[] args) {
		// 1-2-3=6
		// 1-2-47-14=28
		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println("Mukemmel sayidir.");
		} else {
			System.out.println("Mukemmel sayi degildir.");
		}

	}

}
