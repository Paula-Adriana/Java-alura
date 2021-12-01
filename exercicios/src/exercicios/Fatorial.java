package exercicios;

public class Fatorial {

	public static void main(String[] args) {

		int fatorial = 1;

		/*for (int n = 1; n <= 10; n++) {
			for (int i = n; i == n; i--) {
				fatorial = i * fatorial;
				System.out.println("Fatorial de " + n + "! é = " + fatorial);
			}

		}*/
		for (int n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + "! é = " + fatorial);
			
		}
		
	}
}
