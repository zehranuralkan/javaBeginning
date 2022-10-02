package intro;

public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1="Engin Demirog";
		String ogrenci2="Zehra Alkan";
		String ogrenci3="Salih";
		
		String[] ogrenciler=new String[3];
		ogrenciler[0]="Engin Demiroð";
		ogrenciler[1]="Zehra Alkan";
		ogrenciler[2]="Salih";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
