
public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {

		case 'A':
			System.out.println("Tebrikler,tam puan");
			break;
		case 'B':
			System.out.println("güzel puan.");
			break;
		case 'C':
			System.out.println("Fena degil.");
			break;
		case 'D':
			System.out.println("gectin ama calısman lazım.");
			break;
		case 'E':
			System.out.println("Sınırdan gectin.");
			break;
		case 'F':
			System.out.println("kaldın.");
		default:
			System.out.println("gecersiz not girildi.");
		}

	}

}
