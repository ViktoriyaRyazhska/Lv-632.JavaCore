package lesson6.HW6;

import lesson6.HW6.model.*;

import java.util.ArrayList;
import java.util.List;

public class HW6App {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle("white", "round", "Angry", "green"));
        birds.add(new Swallow("blue", "square", "Vap", 2021));
        birds.add(new Chicken("round","circale","Ukraine","Captcha"));
        birds.add(new Penguin("AAAAAAaa","BBBBBbbbb","Germany","Umka"));

        for (Bird bird:birds) {
            bird.fly();
        }
    }
}
