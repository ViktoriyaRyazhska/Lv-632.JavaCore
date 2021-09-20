package lessons3.CW3.model;

public class Employee {
    private String fName;
    private int rate;
    private int hours;
    private static double sum;

    public int getSalary(){
        return rate * hours;
    }

    public int changeRate(int rate){
        this.rate = rate;
        return this.rate;
    }

    public double getBones(){
        return getSalary() * 1.1;
    }

    public Employee() {
    }

    public Employee(String fName, int rate) {
        this.fName = fName;
        this.rate = rate;
    }

    public Employee(String fName, int rate, int hours) {
        this.fName = fName;
        this.rate = rate;
        this.hours = hours;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSum() {
        return sum = getSalary() + getBones();
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "fName='" + fName + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonus=" + getBones() +
                '}';
    }
}