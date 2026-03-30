package felipe.dev.array;

public class Ex1 {

	public static void main(String[] args) {

		String[] nomes = { "Alex", "Felipse", "Pedro" };

		/*for (String nome : nomes) {
			System.out.println(nome);
		}*/
		
		
		for (int i = 0; i < nomes.length; i++) {
			 System.out.println(nomes[i]);
		}
		
		nomes[2] = "Mario pedro";
		
		System.out.println("-------------------------------------------");
		
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		

	}

}
