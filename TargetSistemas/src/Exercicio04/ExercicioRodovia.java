package Exercicio04;

public class ExercicioRodovia {
	public static void main(String[] args) {

		int distancia = 100; // em km
		double velocidadeCarro = 110; // em km/h
		double velocidadeCaminhao = 80; // em km/h
		double tempoPedagioCaminhao = 0.083; // em horas (5 minutos)

		// Tempo que o carro e o caminhão levam para se encontrarem
		double tempoEncontro = distancia / (velocidadeCarro + velocidadeCaminhao);

		// Distância que o carro percorre até o encontro
		double distanciaCarro = velocidadeCarro * tempoEncontro;

		// Distância que o caminhão percorre até o encontro
		double distanciaCaminhao = velocidadeCaminhao * tempoEncontro;
		distanciaCaminhao += 2 * 0.083 * velocidadeCaminhao; // adiciona o tempo dos pedágios

		if (distanciaCarro < distanciaCaminhao) {
			System.out.println("O carro estará mais próximo da cidade de Ribeirão Preto.");
		} else {
			System.out.println("O caminhão estará mais próximo da cidade de Ribeirão Preto.");
			/*a diferença de velocidade entre os dois veículos é menor do que a distância 
			que cada um percorreu, então a velocidade do caminhão em direção a Ribeirão
			Preto faz com que ele esteja mais perto dessa cidade no momento em que eles se cruzarem.*/
		}
	}

}
