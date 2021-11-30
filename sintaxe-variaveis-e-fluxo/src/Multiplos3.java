
public class Multiplos3 {

	public static void main(String[] args) {

		int numero = 1;
		while (numero <= 100) {
			if (numero % 3 == 0) {
				System.out.println(numero);
				numero++;
			} else {
				numero++;
			}
			
		}

	

//Outro jeito

		for (int c = 1; c <= 100; c++) { //ou c += 3
			if (c % 3 == 0) {
				System.out.println(c);
			}
			
		}	
	}
}