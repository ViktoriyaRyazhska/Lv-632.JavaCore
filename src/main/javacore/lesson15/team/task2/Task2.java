package lesson15.team.task2;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public void getTask2(BufferedReader reader) throws IOException {
        System.out.println("Enter number");
        int input = Integer.parseInt(reader.readLine());
        double sqrt = Math.sqrt(input);

        int multiplier = 2;

        while (input > 1 && multiplier <= sqrt) {
            if (input % multiplier == 0) {
                System.out.print(multiplier + " ");
                input /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (input != 1) {
            System.out.print(input);
        }
    }
}
