
public class Main {

	public static void main(String[] args) {
		String [] ogrenciler= new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Muhammet";
		ogrenciler[2]="Burak";
	
		
		for(int i=0;i<ogrenciler.length;i++)
		{
			System.out.println(ogrenciler[i]);
		}
		//Günlük hayattda daha çok ikinci yöntem kullanılır.
		for(String ogrenci:ogrenciler)
		{
			System.out.println(ogrenci);
			
		}
		
	}

}
