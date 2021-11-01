/*
Create method to validate date according to format "mm.dd.yy
 */
package Task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws ParseException {

        String defaultText = "Test result: ";

        String format = "MM:dd:yy";
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        Predicate<String> checkDate = date -> {
            try {
                formatter.parse(date);
                System.out.println("\nValid date format");
                return true;
            } catch (ParseException e) {
                System.out.println("\nInvalid date format");
                return false;
            }
        };

        Date date = new Date();

        System.out.println(defaultText + checkDate.test(date.toString()));
        System.out.println(defaultText + checkDate.test(formatter.format(date)));

        ////////////////////////////////////////////////////////////////////
        //                          Date Converter                        //

        Function<Date, String> dateConverter = formatter::format;

        ArrayList<String> datePool = new ArrayList();
        while (datePool.size()<6) datePool.add(dateConverter.apply(new Date()));

        System.out.println(datePool);
    }
}
