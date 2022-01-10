package lesson013d;

public class CaesarCipherOneWord {

	  public static final char FIRST_CASE_ALPHABET = 'a';
	  public static final char LAST_CASE_ALPHABET = 'z';
	  public static final int ALPHABET_SIZE = ('z' - 'a');

	  public static String caesarCipher(String input, int shift, boolean encrypt) {
			StringBuilder output = new StringBuilder(input.length());
			for (int i = 0; i < input.length(); i++) {
				  char inputChar = input.charAt(i);
				  int calcShift = (encrypt) ? shift : (ALPHABET_SIZE - shift);
				  char pointA = 0;
				  if ((inputChar >= FIRST_CASE_ALPHABET) && (inputChar <= LAST_CASE_ALPHABET)) {
						pointA = FIRST_CASE_ALPHABET;
				  } else {
						output.append(inputChar);
				  }

				  int inputCharIndex = inputChar - pointA;
				  int outputCharIndex = (inputCharIndex + calcShift) % ALPHABET_SIZE;
				  char outputChar = (char) (outputCharIndex + pointA);
				  output.append(outputChar);
			}
			return output.toString();
	  }

	  public static String caesarCipherEncrypt(String text, int shift) {
			return caesarCipher(text, shift, true);
	  }

	  public static String caesarCipherDecrypt(String ciphertext, int shift) {
			return caesarCipher(ciphertext, shift, false);
	  }

	  public static void main(String[] args) {
			int shift = 3;
			String text = "javacore";
			System.out.println("Text: " + text);

			String ciphertext = caesarCipherEncrypt(text, shift);
			System.out.println("Ciphertext: " + ciphertext);

			String decrypted = caesarCipherDecrypt(ciphertext, shift);
			System.out.println("Decrypted: " + decrypted);

			System.out.println("Successful decryption: " + decrypted.equals(text));
	  }

}
