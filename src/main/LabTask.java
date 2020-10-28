package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LabTask {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int currentMonthIndex = gregorianCalendar.get(Calendar.MONTH);
        int currentDate = gregorianCalendar.get(Calendar.DATE);
        Months[] month = Months.values();
        int leftDaysInMonth = month[currentMonthIndex].getNoOfdaysInMonth() - currentDate;
        System.out.println(month[currentMonthIndex].getNoOfdaysInMonth() + " - " + currentDate + " = " + leftDaysInMonth + " Days left in Month " + month[currentMonthIndex] + "!");

    }
}
