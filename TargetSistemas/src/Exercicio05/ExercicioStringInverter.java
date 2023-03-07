package Exercicio05;

public class ExercicioStringInverter {

	public static void main(String[] args) {

		String fraseNormal = "frase invertida";
		String fraseInvertida = "";

		for (int i = fraseNormal.length() - 1; i >= 0; i--) {
			fraseInvertida += fraseNormal.charAt(i);
		}

		System.out.println("o inverso de '" + fraseNormal + "' é: " + fraseInvertida);
	}

}
