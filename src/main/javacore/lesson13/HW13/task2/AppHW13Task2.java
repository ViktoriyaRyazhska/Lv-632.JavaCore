package lesson13.HW13.task2;

import lesson13.HW13.task2.utils.EncriptDecript;

public class AppHW13Task2 {

    public static void main(String[] args) {
        EncriptDecript ed = new EncriptDecript();
        String s = "abc";
        ed.decrypt(ed.encrypt(s, 7), 7);
    }
}