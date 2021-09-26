package com.wmattern0;

import java.util.Date;
import java.util.Calendar;
import java.io.*;

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
