package com.wmattern0;

import java.util.Date;
import java.util.Calendar;

public class TransientTime implements java.io.Serializable {
    private Date time;

    public TransientTime(){
        time = Calendar.getInstance().getTime();
    }

    public Date getTime(){
        return time;
    }
}
