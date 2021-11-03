package lesson15.team.task9;

import java.io.BufferedReader;
import java.io.IOException;

public class Task9 {

    public void getTask9(BufferedReader reader) throws IOException {
        System.out.println("Enter number 'n' ?: ");
        int n = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(takeTrueOrFalse());
            if (takeTrueOrFalse() > 0) {
                result++;
            }
        }
        System.out.println("Count number '1' = " + result);
    }

    public int takeTrueOrFalse() {
        int res = (int) ( Math.random() * 2 );
        return res;
    }
}
