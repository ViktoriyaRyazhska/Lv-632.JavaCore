import classhometask.*;
import utils.Reader;

import java.text.DecimalFormat;

public class Task1App {
    public static void main(String[] args) {
//        /** Task 1 */
        HelloDialog helloDialog = new HelloDialog();
        helloDialog.getHelloDialog();

//        /** Task 2 */
        Reader reader = new Reader();
        Calculator calculator = new Calculator();
        System.out.println("\n" + "Result: = " + calculator
                .getCalculation(reader.inputNumber(), reader.inputNumber()) + "\n");

//        /** Home work */
//        /** Task 1 */
        FlowerBedCalculation flowerBedCalculation = new FlowerBedCalculation();
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Calculating the area of a circle, enter radius: ");
        System.out.println("Area of a circle: " +
                f.format(flowerBedCalculation.getAreaOfCircle(reader.inputNumber())));
        System.out.println("Calculating the perimeter of a circle, enter radius: ");
        System.out.println("Perimeter of a circle: " +
                f.format(flowerBedCalculation.getPerimeterOfCircle(reader.inputNumber())));

//        /** Task 2 */
        Dialog dialog = new Dialog();
        dialog.getDialog();

//        /** Task 3 */
        TelephoneConversations telefon = new TelephoneConversations();
        telefon.getConversations();
    }
}