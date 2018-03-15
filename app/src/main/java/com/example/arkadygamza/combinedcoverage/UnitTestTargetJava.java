package com.example.arkadygamza.combinedcoverage;

public class UnitTestTargetJava {
    public int testMeFromKotlin() {
        int i = 0;
        i++;
        return i;
    }

    public int testMeFromJava() {
        int i = 0;
        i--;
        return i;
    }
}
