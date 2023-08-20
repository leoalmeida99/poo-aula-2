package aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int entrada = -1;
		ArrayList<Carro> cars = new ArrayList<>();
		
		System.out.println("Bem-vindo ao Sistema Carros!");
		
		while(entrada != 0) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("1 - Criar e adicionar carro");
				System.out.println("2 - Criar e adicionar carro");
				System.out.println("0 - Sair do sistema");
				
				entrada = sc.nextInt();
			}
			switch (entrada) {
			case 1: {
				Carro carro = new Carro();
				carro = carro.criarCarro(carro);
				cars.add(carro);
			}
			case 2: {
				System.out.println(cars.toString());
			}
			default:
			}
		}
		System.out.println("Bye Bye ;-D");
	}
}