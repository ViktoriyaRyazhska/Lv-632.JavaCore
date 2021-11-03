package lesson8.HW8.task2;

public class Wrapper<T> {
    private T value;

    public Wrapper() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "value=" + value +
                '}';
    }
}
