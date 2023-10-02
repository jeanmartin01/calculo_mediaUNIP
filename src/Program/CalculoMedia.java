package Program;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a nota da NP1: ");
	        double NP1 = scanner.nextDouble();

	        System.out.print("Digite a nota da NP2: ");
	        double NP2 = scanner.nextDouble();

	        System.out.print("Digite a nota do PIM: ");
	        double PIM = scanner.nextDouble();

	        double media = (NP1 + NP2 + (PIM * 2)) / 4;

	        System.out.println("A média é: " + media);


	        if (media >= 5.0) {
	            System.out.println("Parabéns! Você foi aprovado.");
	        } else {
	            System.out.println("Infelizmente, você foi reprovado.");
	        }

	        scanner.close();
	    }
	}