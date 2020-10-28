package main;

public enum Months {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(30),
    SEPTEMPER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int noOfdaysInMonth;
    Months(int noOfdaysInMonth){
        this.noOfdaysInMonth = noOfdaysInMonth;
    }

    public int getNoOfdaysInMonth() {
        return noOfdaysInMonth;
    }

}
