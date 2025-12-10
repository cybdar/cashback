package ru.netology.cashback;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerTest {

    @Test
    public void shouldFailWhenAmountIs1000() {
        CashbackHacker service = new CashbackHacker();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}