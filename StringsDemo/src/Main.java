
public class Main {

	public static void main(String[] args) {
		
   String mesaj="İzmir'de hava sıcak.";
   System.out.println(mesaj);
   System.out.println("karakter sayisi:" + mesaj.length());
   System.out.println("8.eleman:"+mesaj.charAt(8));
   System.out.println(mesaj.concat("selam"));
   System.out.println(mesaj.startsWith("c"));
   System.out.println(mesaj.endsWith("."));
   
   
   
   String yeniMesaj=mesaj.replace("", "*");
   
   System.out.println(yeniMesaj);
   System.out.println(mesaj.substring(7));
   for(String kelime : mesaj.split(" "))
   {
	   System.out.println(kelime);
   }
   
   System.out.println(mesaj.toLowerCase());
   System.out.println(mesaj.toUpperCase());

	}

}
