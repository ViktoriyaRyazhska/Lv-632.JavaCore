public class Empoyee {
    String name;
    int departmentNumber;
    int salary;

    public Empoyee(String name, int departmentNumber, int salary){
        this.name=name;
        this.departmentNumber=departmentNumber;
        this.salary=salary;
    }

     static Empoyee[] createEmployees (){                              //initialise new array
        Empoyee[] array = new Empoyee[5];
        array[0] = new Empoyee("Steve", 1, 800);
        array[1] = new Empoyee("Uriy", 1, 900);
        array[2] = new Empoyee("Mark", 2, 1200);
        array[3] = new Empoyee("Teo", 2, 1500);
        array[4] = new Empoyee("Frank", 1, 900);
        return array;
    }

     static void findByDepartmentNumb (Empoyee[] array, int numberOfDepartment){    //find person with define department number
        for(Empoyee person:array){
            if(person.departmentNumber==numberOfDepartment){
                System.out.println(person);
            }
        }
    }

     static void sortBySalary (Empoyee[] array){            //sort employees by salary from larger to lesser amount
         System.out.println("");                            //skip down
        for (int i=array.length; i>0; i--){
            for (int a=1; a<array.length; a++){
                Empoyee temp;
                if(array[a].salary>array[a-1].salary){
                    temp=array[a-1];
                    array[a-1]=array[a];
                    array[a]=temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Name: "+name+" | Department:"+ departmentNumber +" | Salary: "+salary;
    }
}
