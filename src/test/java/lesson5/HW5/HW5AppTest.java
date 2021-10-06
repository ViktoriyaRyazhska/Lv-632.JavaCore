package lesson5.HW5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HW5AppTest {
    HW5 hw5 = new HW5();
    int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);

    @Test
    void numberOfMonth() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        int expected = hw5.NumberOfMonth(dayMonth, bufferedReader);
        int actual = 31;
        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonth_Ver2() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        int expected = hw5.NumberOfMonth_Ver2(dayMonth, bufferedReader);
        int actual = 31;
        assertEquals(expected, actual);
    }

    @Test
    void calculateSumOfElements() {
        int[] arr = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int expected = hw5.calculateSumOfElements(arr);
        int actual = 25 + 3125;
        assertEquals(expected, actual);
    }

    @Test
    void shouldTwoPositivNumber() {
        int[] arr = {2, -3, 4, 8, 12};
        int expected = hw5.findPosition(arr);
        int actual = 4;
        assertEquals(expected, actual);
    }

    @Test
    void enteringNotNegativNumbers() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2","2","2","-5");
        int expected = hw5.enteringNotNegativNumbers(bufferedReader);
        int actual = 8;
        assertEquals(expected, actual);
    }
}