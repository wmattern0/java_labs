package com.wmattern0;

import java.util.Date;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        Date now = getDate();
        System.out.println("Begin at: " + now.toString());
    }

    public static Date getDate(){
        return Calendar.getInstance().getTime();
    }
}
