package lesson15.team;

import lesson15.team.utils.MenuTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppTeamTasks {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuTask menuTask = new MenuTask();

        menuTask.getTask(reader);
    }
}
