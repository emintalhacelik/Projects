package intro;

public class Main {

	public static void main(String[] args) {
       
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "Intenet Subesı";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		Boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("dolar düştü resmi");
		}else if(dolarBugun>dolarDun) {
		     System.out.println("dolar yükseldi resmi");
		}
		
		else {
			System.out.println("dolar eşittir resmi");
		}
		String kredi1 ="Hızlı Kredi";
		String kredi2 ="Mutlu Emekli Kredisi";	
		String kredi3 ="Konut Kredisi";
		String kredi4 ="Çiftçi Kredisi";
		String kredi5 ="Msb Kredisi";
		String kredi6 ="Meb Kredisi";
		String kredi7 ="Kültür bakanlığı Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		
		String[] krediler = 
			{
					"Hızlı Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"Çiftçi Kredisi",
					"Msb Kredisi",
					"Kültür bakanlığı Kredisi"
					
			};
		
		//foreach
		for(String kredi : krediler ) {
		    System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
	}

}
