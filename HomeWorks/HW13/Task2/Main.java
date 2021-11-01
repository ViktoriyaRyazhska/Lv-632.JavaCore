/*
2. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
   Method encrypt should take a string and return coded string where every letter is moved on
   n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return
   decoded value
 */
package Task2;

public class Main {
    public static void main(String[] args) {

        Crypt encrypt = c -> ++c;
        Crypt decrypt = c -> --c;

        System.out.println(encrypt.textCrypt("abc", 3));
        System.out.println(decrypt.textCrypt("def", 3));
        }
    }


