package Exercicio02;
import java.util.Scanner;

/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa 
na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci 
e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/

public class ExercicioFibonacci {
    public static void main(String[] args) {
        // Lê um número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        int a = 0;
        int b = 1;
        while (b < numero) {
            int soma = a + b;
            a = b;
            b = soma;
        }
        if (b == numero) {
            System.out.println("o numero " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("o numero " + numero + " nao pertence a sequencia de Fibonacci.");
        }
    }
}