package lesson1.classhometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloDialog {
    public void getHelloDialog() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Hello. How are you?");
        try {
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You are " + name + "\n");
    }
}