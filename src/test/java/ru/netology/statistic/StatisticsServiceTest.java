package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findNegativeNumber() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { -12, -19, -5, -12, -4, -20, -7_000, -225, -173, -1_000, -1};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findZeroNumber() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { -12, -19, -5, -12, -4, -20, 0, -225, -173, -1_000, -1};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativeNumber() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { -12, -19, -5, -12, -4, -20, 0, -1, -173, -1_000, 1};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}