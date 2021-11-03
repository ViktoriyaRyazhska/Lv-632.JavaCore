package lesson15.team.utils;

public enum TaskType {
    task1("Name task1 description"),
    task2("Name task2"),
    task3("Name task3"),
    task4("Name task1"),
    task5("Name task1"),
    task6("Name task1"),
    task7("Name task1"),
    task8("Name task1"),
    task9("Name task1"),
    task10("Name task1"),
    task11("Name task1"),
    task12("Name task1"),
    task13("Name task1"),
    task14("Name task1"),
    exit("Exit Task");

    private final String value;

    TaskType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}