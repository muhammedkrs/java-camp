
public class Main {

	public static void main(String[] args) {
		int sayi=1;
		String[][] sehirler=new String[3][3];
		sehirler[0][0]="İzmir";
		sehirler[0][1]="Ankara";
		sehirler[0][2]="İstanbul";
		sehirler[1][0]="Bursa";
		sehirler[1][1]="Adana";
		sehirler[1][2]="Antalya";
		sehirler[2][0]="Konya";
		sehirler[2][1]="Elazıg";
		sehirler[2][2]="Siirt";
		for(int i=0;i<=2;i++)
		{if(i>0)
		{System.out.println("********************");}
				for(int j=0;j<=2;j++)
			{
				System.out.println(sehirler[i][j]);
			}
			
		}

	}

}
