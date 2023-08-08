package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashBackHackerTest {
    @Test
    public void shouldCashBackIfAmount800() {
        CashBackHacker service = new CashBackHacker();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);


    }

    @Test
    public void shouldCashBackIfAmount1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}
  
