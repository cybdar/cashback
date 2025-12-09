package ru.netology.cashback;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerJUnitTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHacker service = new CashbackHacker();
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldReturn0IfAmount1000_butFails() {
        CashbackHacker service = new CashbackHacker();
        Assert.assertEquals(0, service.remain(1000));
    }
}
