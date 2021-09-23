public class Main3Lesson {
    public static void main(String[] args) {

        Employee taras = new Employee("Taras", 15,140);

        Employee oleg = new Employee("Oleg", 15);
        oleg.setHours(160);

        Employee teodor = new Employee("Teodor", 13, 140);
        teodor.changeRate(16);

        System.out.println(taras +"\n"+ oleg +"\n"+ teodor);
        Employee gettotalsum = new Employee();
        System.out.println(gettotalsum.getTotalSum());
    }
}
