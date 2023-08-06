package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {
    @Test
    public void shouldCashBackIfAmount800() {
        CashBackHacker service = new CashBackHacker();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual,expected);

    }

    @Test
    public void shouldCashBackIfAmount1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }
}