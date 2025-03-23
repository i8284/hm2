package ru.netology.service;

public class CustomsService {
    public static final int DUTY_RATE = 100;

    public static int calculateCustoms(int a, int b) {
        return (a/100) + b * DUTY_RATE;
    }
}
