package javautil;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String [] args){
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        cal.add(Calendar.HOUR, 5);
        //현재 칼랜더에 시간을 5시간 더하는 방법. 5를 -5로 수정하면 5시가 전을 구할 수 있게 됩니다.
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
    }
}
