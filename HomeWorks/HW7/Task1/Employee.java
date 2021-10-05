package Task1;

public abstract class Employee {

    public int salary;
    public String name;
    public static int employeeId = 1;


    public static Employee[] sortBySalary (Employee[] array){
        for (int a=array.length; a>0; a--){
            for (int i=1; i<array.length; i++){
                if (array[i].salary>array[i-1].salary){
                    Employee temp = array[i-1];
                    array[i-1]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }
}




