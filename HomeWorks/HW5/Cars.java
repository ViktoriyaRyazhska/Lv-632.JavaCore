import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cars {           // Task 4 - Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars

    private String type;
    private int year;
    private double engineCapacity;

    public Cars(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }



    static public void findByYear(Cars[] array) throws IOException {                       // Method find car by model year
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter year of production: ");
        int findYear = Integer.parseInt(reader.readLine());
        for (Cars car : array) {
            if (car.year == findYear) System.out.println(car);
        }
        System.out.println("Done\n");
    }

    static public Cars[] sortCars(Cars[] array) {                   // Method sort car by model year
        Cars[] carlist = array;
        for (int i = carlist.length; i > 0; i--) {
            for (int a = 1; a < carlist.length; a++) {
                if (carlist[a].year > carlist[a - 1].year) {
                    Cars temp = carlist[a - 1];
                    carlist[a - 1] = carlist[a];
                    carlist[a] = temp;
                }
            }
        }
        return carlist;
    }

    @Override
    public String toString() {
        return "Type: "+ type +", Year: "+ year +", Engine Capacity: "+engineCapacity;
    }
}


