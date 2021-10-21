//        1 Enter the two variables of type String. Determine whether the first variable substring second.
//        For example, if you typed «IT» and «IT Academy» you must receive true.
//
//        2 Enter surname, name and patronymic on the console as a variable of type String.
//        Output on the console:
//        - surnames and initials
//        - name
//        - name, middle name and last name
//
//        3 The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
//        Using regular expressions implement checking the user name for validity. Input five names in
//        the main method . Output a message to the console of the validation of each of the entered names.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String str1 = "IT";                                                      //Task 1
        String str2 = "IT Academy";
        System.out.println(str2.contains(str1));


        String person = "Baggins Bilbo Tukovich";                                //Task2
        String[] parts = person.split(" ");
        System.out.println(parts[0]+parts[1].charAt(0)+parts[2].charAt(0));   //surnames and initials
        System.out.println(parts[1]);                                         //name
        System.out.println(parts[1]+parts[2]+parts[0]);                       //name, middle name and last name


        String userName = "Valera";                                              //Task 3
        System.out.println(Main.checkString(userName));
    }
        public static boolean checkString (String userName){
        Pattern p = Pattern.compile("^[a-zA-Z\\d_]{3,15}$");
            Matcher m = p.matcher(userName);
            return m.matches();
        }
}


