import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4Lesson {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        isOdd(Integer.parseInt(reader.readLine());
        isOdd(Integer.parseInt(reader.readLine());
        isOdd(Integer.parseInt(reader.readLine());

        int day = Integer.parseInt(reader.readLine());

        switch (day){
            case 1:
                System.out.println("понеділок, monday, ");
                break;
            case 2:
                System.out.println("вівторок, Tuesday, ");
                break;
            case 3:
                System.out.println("середа, Wednesday, ");
                break;
            case 4:
                System.out.println("четвер, Thursday, ");
                break;
            case 5:
                System.out.println("п'ятниця, Friday, ");
                break;
            case 6:
                System.out.println("субота, Saturday, ");
                break;
            case 7:
                System.out.println("неділя, Sunday, ");
                break;
            default:
                System.out.println("Wrong number!");;
        }

        String country = reader.readLine();

        switch (country){
            case "Ukraine":
                System.out.println(Continents.Europe);
                break;
            case "South Africa":
                System.out.println(Continents.Africa);
                break;
            case "South Korea":
                System.out.println(Continents.Asia);
                break;
            case "Australia":
                System.out.println(Continents.Australia);
                break;
            case "Canada":
                System.out.println(Continents.NorthAmerica);
                break;
            case "Brazil":
                System.out.println(Continents.SouthAmerica);
                break;
            default:
                System.out.println("This country is not in list");
    }
}

    static void isOdd (int x){
    if(x%2!=0) System.out.println(x + " is odd");
    else System.out.println(x + " is not odd");
    }


}
