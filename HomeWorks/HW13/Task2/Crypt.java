package Task2;

@FunctionalInterface
public interface Crypt {

      default String textCrypt(String text,int number){         //create default method with main logic of crypt
            StringBuilder result= new StringBuilder();
            char[] word = text.toCharArray();
            for(int i=0; i<word.length; i++) {
                  for (int x = 0; x < number; x++) {
                        word[i] = crypt(word[i]);                //in this line are using functional method "crypt" that declared below
                  }
                  result.append(word[i]);
            }
            return result.toString();
      }


      char crypt(char c);                                         //functional method for lambda expression
}
