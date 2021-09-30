package lesson6.HW6;

import lesson6.HW6.model.Bird;
import lesson6.HW6.model.Eagle;
import lesson6.HW6.model.Swallow;

import java.util.ArrayList;
import java.util.List;

public class HW6App {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle("white", "round", "Angry", "green"));
        birds.add(new Swallow("blue", "square", "Vap", 2021));

        for (Bird bird:birds) {
            bird.fly();
        }
    }
}
