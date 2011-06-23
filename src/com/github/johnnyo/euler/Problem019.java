package com.github.johnnyo.euler;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Problem019 extends BaseTestCase {

    @Override
    public String getAnswer() {
        // TODO Auto-generated method stub
        return "171";
    }

    @Override
    public String solve() {
        GregorianCalendar endDate = new GregorianCalendar(2000, 11, 31);

        GregorianCalendar calendar = new GregorianCalendar(1901, 0, 1);
        int count = 0;
        while (calendar.before(endDate)) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                count++;
            }
            calendar.add(Calendar.MONTH, 1);
        }
        return Integer.toString(count);

    }

}
