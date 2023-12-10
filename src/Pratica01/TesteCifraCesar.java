package Pratica01;

import java.util.Scanner;

public class TesteCifraCesar {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Digite o texto para cifrar:");
		String texto = scanner.nextLine();
		System.out.print("Digite uma chave:");
		byte chave = scanner.nextByte();
		String cifrado = CifraCesar.cifrar(texto, chave);
		System.out.println("Texto cifrado: " + cifrado);
		texto = CifraCesar.decifrar(cifrado, chave);
		System.out.println("Texto decifrado: "  + texto);
	}
}
