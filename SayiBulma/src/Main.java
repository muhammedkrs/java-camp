
public class Main {

	public static void main(String[] args) {
		int []sayilar= {1,2,4,5,6,9,3};
		int aranacak=7;
		boolean varMi=false;
		for(int i=0;i<sayilar.length;i++)
		{
			if(sayilar[i]==aranacak)
			{
				varMi=true;
			}
			
		}
	
		if(varMi)
		{
			System.out.println("sayi mevcuttur");
		}
		else {
			System.out.println("sayi mevcut degildir.");
		}

	}

}
