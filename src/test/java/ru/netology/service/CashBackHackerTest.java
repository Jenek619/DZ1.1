package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashBackHackerTest {

    @Test
    public void shouldCashBackIfAmount800() {
        CashBackHacker service = new CashBackHacker();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCashBackIfAmount1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
