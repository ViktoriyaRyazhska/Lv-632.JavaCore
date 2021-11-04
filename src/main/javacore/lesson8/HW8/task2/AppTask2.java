package lesson8.HW8.task2;

import java.util.ArrayList;
import java.util.List;

public class AppTask2 {
    public static void main(String[] args) {
        Wrapper<Integer> wrapper1 = new Wrapper<>();
        Wrapper<String> wrapper2 = new Wrapper<>();
        Wrapper<Boolean> wrapper3 = new Wrapper<>();
        wrapper1.setValue(25);
        wrapper2.setValue("Hello!");
        wrapper3.setValue(true);

        List<Wrapper> wrapperList = new ArrayList<>();
        wrapperList.add(wrapper1);
        wrapperList.add(wrapper2);
        wrapperList.add(wrapper3);

        wrapperList.forEach(wrapper -> System.out.println(wrapper.getValue()));
    }
}