import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your name? ");
        String name;
        while (true){       //check that name is not empty
            name = reader.readLine();
            if (name.isEmpty())
                System.out.println("You typed incorrect name, please try again");
            else break;
            }

        System.out.print("Where are you live, (name)? ");
        String address;
        while (true){       //check that address is not empty
            address = reader.readLine();
            if (address.isEmpty())
                System.out.println("You typed incorrect address, please try again");
            else break;
                }

        System.out.println("Name: "+ name +"\nAddress: "+ address);
        }
    }

