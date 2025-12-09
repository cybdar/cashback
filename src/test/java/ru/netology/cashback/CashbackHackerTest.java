package ru.netology.cashback;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerTest {

    @Test
    public void shouldReturn0If1000() {
        CashbackHacker service = new CashbackHacker();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500If1500() {
        CashbackHacker service = new CashbackHacker();

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0If0() {
        CashbackHacker service = new CashbackHacker();

        int actual = service.remain(0);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}