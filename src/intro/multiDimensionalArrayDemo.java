package intro;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
	String [][] sehirler=new String [3] [3];
	sehirler[0][0]="iSTANBUL";
	sehirler[0][1]="BURSA";
	sehirler[0][2]="BÝLECÝK";
	sehirler[1][0]="ANKARA";
	sehirler[1][1]="KONYA";
	sehirler[1][2]="KAYSERÝ";
	sehirler[2][0]="DÝYARBAKIR";
	sehirler[2][1]="ÞANLIURFA";
	sehirler[2][2]="GAZÝANTEP";


	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.println(sehirler[i][j]);
		}
	}
	}

}
