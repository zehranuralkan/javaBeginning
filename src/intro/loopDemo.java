package intro;

public class loopDemo {

	public static void main(String[] args) {
		//for
		 for(int i=1;i<=10;i++) {
			 System.out.println(i);
		 }
		 System.out.println("For Döngüsü Bitti");
		 
		 int j=3;
		 //while
		 while(j<10) {
			 System.out.println(j);
			 j+=5 ;
		 }
		 System.out.println("While  Döngüsü Bitti");
		 
		 //do while
		 int k=1;
		 do {
			 System.out.println(k);
			 k+=5 ; 
		 }  while(k<10)  ;
		 System.out.println("Do While Döngüsü Bitti");
	}

}
