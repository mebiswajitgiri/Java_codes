package com.company.Enum;

public class main
{
    enum days
    {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    }

    public static void main(String[] args) {
        days day=days.FRIDAY;
        System.out.println(day);
        System.out.println(days.values());
        for(days d : days.values())
        {
            System.out.println(d);
        }
    }
}
