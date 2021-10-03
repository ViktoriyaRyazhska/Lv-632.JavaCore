public class Main5Lesson {


    public static void main(String[] args) {
        int[] array = {1,2,5,8,4,-10,-5,6,4,-2};

        ArrayMethods.biggestElement(array);
        ArrayMethods.positiveSum(array);
        ArrayMethods.amountNegative(array);
        ArrayMethods.compare(ArrayMethods.positiveNumb, ArrayMethods.negativeNumb);

        Empoyee[] employees = Empoyee.createEmployees();
        Empoyee.findByDepartmentNumb(employees,2);
        Empoyee.sortBySalary(employees);
        for (Empoyee person:employees) System.out.println(person);


    }
}



