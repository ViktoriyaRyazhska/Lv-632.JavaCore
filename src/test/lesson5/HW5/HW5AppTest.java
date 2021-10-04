package lesson5.HW5;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class HW5AppTest {
    HW5 hw5 = new HW5();
    int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//    @Mock BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Test
    void numberOfMonth() throws IOException{
//        when(reader.readLine()).thenReturn(1);
        int expected = hw5.NumberOfMonth(dayMonth,reader);
        int actual = 31;
        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonth_Ver2() throws IOException {
        int expected = hw5.NumberOfMonth_Ver2(dayMonth, reader);
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
    void enteringNotNegativNumbers() throws  IOException{
        int expected = hw5.enteringNotNegativNumbers(reader);
        int actual = 8;
        assertEquals(expected, actual);
    }
}