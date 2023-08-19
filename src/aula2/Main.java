package aula2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Carro c1 = new Carro();
//		Carro c2 = new Carro();
//		Carro c3 = new Carro();
//		c1.setarVelocidade(30, 2);
//		c2.setarVelocidade(30, 2);
//		c3.setarVelocidade(30, 2);
		
		System.out.println("Qual o consumo médio do carro 1? ");
		c1.setConsumoMedio(sc.nextFloat());
		System.out.println("Quantos litros ele possui no tanque do carro 1? ");
		c1.setTanque(sc.nextFloat());
		
		while(c1.getTanque() != 0) {
			System.out.println("qual a velocidade média?");
			float vm = sc.nextFloat();
			System.out.println("quanto tempo o carro permaneceu nessa velocidade?");
			float tempo = sc.nextFloat();
			
			c1.setarVelocidade(vm, tempo);
			System.out.println("Tanque: " + c1.getTanque());
			System.out.println("Odometro: " + c1.getOdometro());
		}
		
//		System.out.println("Carro1 odometro.: " + c1.getOdometro() + " KM");
//		System.out.println("Carro1 tanque...: " + c1.getTanque() + " L");
//		
//		System.out.println("Carro2 odometro.: " + c2.getOdometro() + " KM");
//		System.out.println("Carro2 tanque...: " + c2.getTanque() + " L");
//		
//		System.out.println("Carro3 odometro.: " + c3.getOdometro() + " KM");
//		System.out.println("Carro3 tanque...: " + c3.getTanque() + " L");
		
//		int entrada = -1;
//		boolean Sistema = true;
		
//		System.out.println("Bem-vindo ao Sistema Carros!");
		
//		while(entrada != 0) {
//			
//			System.out.println("1 - Adicionar carro");
//			System.out.println("0 - Sair do sistema");
//			
//			entrada = sc.nextInt();
//			
//			switch (entrada) {
//			case 1: {
//				System.out.print("Marca: ");
//				String marca = sc.nextLine();
//				System.out.print("");
//				
//			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + entrada);
//			}
//			
//		}
			
		System.out.println("Bye Bye ;-D");
		
	}
}
