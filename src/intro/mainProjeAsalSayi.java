package intro;

public class mainProjeAsalSayi {

	public static void main(String[] args) {
		int number=10;
		int remainder=number%2;
		boolean isPrime=true; 
		if(number<1) {
			System.out.println("Geçersiz Sayi");
			return;
		}
		if(number==1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
			 
		}
		if(isPrime)
			System.out.println("Sayý asaldýr");
		else
			System.out.println("Sayý asal deðildir.");
	}

}
