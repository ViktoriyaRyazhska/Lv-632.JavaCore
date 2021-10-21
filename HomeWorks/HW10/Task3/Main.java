package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] currencies = new String[4];
        System.out.println("input four occurrences of US currency in format: $**.**");
        for (String currency: currencies){
            currency = reader.readLine();
            System.out.println(Main.validation(currency));
        }

    }
    private static boolean validation (String currency){
        Pattern p = Pattern.compile("\\$[\\d]+\\.[\\d]{2}");
        Matcher m = p.matcher(currency);
        return m.matches();
    }
}
