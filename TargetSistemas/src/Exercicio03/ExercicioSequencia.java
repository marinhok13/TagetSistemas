package Exercicio03;

//3) Descubra a lógica e complete o próximo elemento:

public class ExercicioSequencia {
	public static void main(String[] args) {
		// Sequência a)está incrementando de dois em dois.
		int a = 7;
		a = a + 2;
		System.out.println("Proximo elemento da sequencia a): " + a);

		// Sequência b)multiplicando cada termo por 2
		int b = 64;
		b = b * 2;
		System.out.println("Proximo elemento da sequencia b): " + b);

		// Sequência e) Fibonacci
		int e = 8;
		int prev1 = 5, prev2 = 8;
		e = prev1 + prev2;
		System.out.println("Proximo elemento da sequencia e): " + e);

		// Sequência f) Talvez numeros que comecem com a letra "D"
		System.out.println("Sequencia de numeros aparentam iniciar com lera D, entao o proximo seria 200");
	}

}
