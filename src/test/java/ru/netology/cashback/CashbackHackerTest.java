package ru.netology.cashback;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackerTest {

    @Test
    public void shouldFailWhenAmountIs1000() {
        CashbackHacker service = new CashbackHacker();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}