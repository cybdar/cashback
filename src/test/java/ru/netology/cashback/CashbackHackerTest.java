package ru.netology.cashback;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHacker service = new CashbackHacker();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }
}
