public class Employee {
    private String name;
    private int rate;
    private int hours;

    public static int totalSum;

    public Employee(){};

    public Employee(String name, int rate){
        this.name=name;
        this.rate=rate;
        Employee.totalSum+=getSalary()+getBonues();
    }

    public Employee(String name, int rate, int hours){
        this.name=name;
        this.rate=rate;
        this.hours=hours;
        Employee.totalSum+=getSalary()+getBonues();
    }
    @Override public String toString() {
        return "Person: " + name + "; Hours: " + hours + "; Rate: " + rate + "; Salary: " + getSalary()+"; Bonues: "+getBonues();
    }

        public void setHours(int hours){
        this.hours=hours;
        }

        public int getSalary() {
            return hours * rate;
        }

        public void changeRate(int rate){
        this.rate=rate;
        }

        public int getBonues (){
        return (int) (getSalary()*0.1);
        }

        public int getTotalSum(){
            return totalSum;
        }
}
