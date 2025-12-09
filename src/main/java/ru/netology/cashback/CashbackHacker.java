package ru.netology.cashback;

public class CashbackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        int remainder = amount % boundary;

        if (remainder == 0) {
            return 0;
        }

        return boundary - remainder;
    }
}