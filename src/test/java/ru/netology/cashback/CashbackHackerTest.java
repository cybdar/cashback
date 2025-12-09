package ru.netology.cashback;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackerTest {

    @Test
    public void shouldReturn0If1000() {
        CashbackHacker service = new CashbackHacker();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500If1500() {
        CashbackHacker service = new CashbackHacker();

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0If0() {
        CashbackHacker service = new CashbackHacker();

        int actual = service.remain(0);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
