package lesson15.team.utils;

import lesson15.team.Task1.Task1;
import lesson15.team.Task7.Task7;
import lesson15.team.Task8.Task8;
import lesson15.team.task2.Task2;
import lesson15.team.task6.Task6;

import lesson15.team.task9.Task9;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class MenuTask {

    public void getTask(BufferedReader reader) {
        String text = "";

        do {
            TaskType task = promptForTaskType("Please, enter a between 'task1 - task14' or exit: ");
            switch (task) {
                case task1:
                    System.out.println("Task1 start !!!");
                    Task1 task1 = new Task1();
                    task1.getTask1(reader);
                    System.out.println("Finish task1 !!!");
                    break;
                case task2:
                    System.out.println("Task2 start !!!");
                    Task2 task2 = new Task2();
                    try {
                        task2.getTask2(reader);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case task3:
                    System.out.println("Task3 start !!!");
                    break;
                case task4:
                    System.out.println("Task4 start !!!");
                    break;
                case task5:
                    System.out.println("Task5 start !!!");
                    break;
                case task6:
                    System.out.println("Task6 start !!!");
                    Task6 task6 = new Task6();
                    try {
                        task6.getTask6(reader);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Finish task6 !!!");
                    break;
                case task7:
                    System.out.println("Task7 start !!!");
                    Task7 task7 = new Task7();
                    try {
                        task7.getTask7(reader);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Finish task7 !!!");
                    break;
                case task8:
                    System.out.println("Task8 start !!!");
                    Task8 task8 = new Task8();
                    try {
                        task8.getTask8(reader);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Finish task8 !!!");
                    break;
                case task9:
                    System.out.println("Task9 start !!!");
                    Task9 task9 = new Task9();
                    try {
                        task9.getTask9(reader);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Finish task9 !!!");
                    break;
                case task10:
                    System.out.println("Task10 start !!!");
                    break;
                case task11:
                    System.out.println("Tas11 start !!!");
                    break;
                case task12:
                    System.out.println("Task12 start !!!");
                    break;
                case task13:
                    System.out.println("Task13 start !!!");
                    break;
                case task14:
                    System.out.println("Task14 start !!!");
                    break;

                case exit:
                    text = "exit";
                    break;
            }
        } while (text != "exit");
    }

    private String promptForText(String input) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        do {
            System.out.println(input);
            text = scanner.nextLine();
        } while (StringUtils.isBlank(text));
        return text;
    }

    private TaskType promptForTaskType(String input) {
        TaskType task = null;
        do {
            try {
                task = TaskType.valueOf(promptForText(input).toLowerCase());
            } catch (Exception e) {
                System.out.println("Wrong input, please enter a between 'task1 - task14' or exit:  needed !!!");
            }
        } while (task == null);
        return task;
    }
}
