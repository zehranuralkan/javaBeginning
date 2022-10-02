package intro;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman sayýsý: "+mesaj.length());
		System.out.println("Beþinci Eleman:" +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf("e")); 
		System.out.println(mesaj.replace("","-"));
		System.out.println(mesaj.substring(2,5));
		for(String kelime:mesaj.split((""))) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
	}

}
