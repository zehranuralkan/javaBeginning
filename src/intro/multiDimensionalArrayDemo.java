package intro;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
	String [][] sehirler=new String [3] [3];
	sehirler[0][0]="iSTANBUL";
	sehirler[0][1]="BURSA";
	sehirler[0][2]="B�LEC�K";
	sehirler[1][0]="ANKARA";
	sehirler[1][1]="KONYA";
	sehirler[1][2]="KAYSER�";
	sehirler[2][0]="D�YARBAKIR";
	sehirler[2][1]="�ANLIURFA";
	sehirler[2][2]="GAZ�ANTEP";


	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.println(sehirler[i][j]);
		}
	}
	}

}
