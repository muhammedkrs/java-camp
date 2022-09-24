
public class Main {

	public static void main(String[] args) {

		sayiBulma(2);

	}

	public static void sayiBulma(int arananSayi) {
		boolean sayiVarMi = false;
		int[] sayilar = { 2, 6, 8, 3, 5, 9, 7 };
		for (int i = 0; i < sayilar.length; i++) {
			if (arananSayi == sayilar[i]) {
				sayiVarMi = true;
				break;
			}

		}
		if (sayiVarMi) {
			mesajYolla("Aranan sayi: " + arananSayi + " bulundu.");
		} else {
			mesajYolla("Aranan sayi: " + arananSayi + " bulunamadi.");
		}

	}

	public static void mesajYolla(String mesaj) {
		System.out.println(mesaj);
	}

}
