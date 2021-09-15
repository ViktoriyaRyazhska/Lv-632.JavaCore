package classhometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dialog {
    public void getDialog(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String name = "";
        String address = "";
        System.out.println("Hello. What is your name?");
        try {
            name = br.readLine();
            System.out.println("Where are you live, " + name + "?");
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        stringBuilder.append("My name is ")
                .append(name)
                .append(" and I live in ")
                .append(address)
                .append("\n");
        System.out.println(stringBuilder);
    }
}