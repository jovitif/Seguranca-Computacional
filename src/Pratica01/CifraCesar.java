package Pratica01;

public class CifraCesar {
	public static String cifrar(String textoAberto, int chave) {
		String codificado = "";
		for (int i = 0; i < textoAberto.length(); i++) {
			codificado += cifrar(textoAberto.charAt(i), chave);
		}
		return codificado;
	}

	private static char cifrar(char charAberto, int chave) {
		char charCodificado;
		if (charAberto >= 97 && charAberto <= 122)
			charCodificado = (char) ((charAberto - 97 + chave) % 26 + 97);
		else if (charAberto >= 65 && charAberto <= 90)
			charCodificado = (char) ((charAberto - 65 + chave) % 26 + 65);
		else
			charCodificado = charAberto;
		return charCodificado;
	}

	public static String decifrar(String textoAberto, int chave) {
		String codificado = "";
		int chaveDecifrar = 26 - chave;
		for (int i = 0; i < textoAberto.length(); i++) {
			codificado += cifrar(textoAberto.charAt(i), chaveDecifrar);
		}
		return codificado;
	}
}