import java.util.stream.Collectors;

public class EncryptDecrypt {

	public static void main(String[] args) {

		String words = "abc";
		int changer = 3;
		String encrypt = encrypt(words, changer);
		String decrypt = decrypt(encrypt, changer);

		System.out.println(encrypt);
		System.out.println(decrypt);
		
	}
	public static String encrypt(String s, int n) {
		String encrypted = s.chars().mapToObj(e -> ((char) (e + n))).map(String::valueOf).collect(Collectors.joining());
		return encrypted;
	}
	
	public static String decrypt(String s, int n) {
		
		String decrypted = s.chars().mapToObj(e -> ((char) (e - n))).map(String::valueOf).collect(Collectors.joining());
		return decrypted;
	}
}


		