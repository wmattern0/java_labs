package com.wmattern0;

import java.util.Date;
import java.util.Calendar;

public class TransientTime implements java.io.Serializable {
    private Date time;
    private transient Long thread;

    public TransientTime(){
        time = Calendar.getInstance().getTime();
        thread = (Long)Math.round(Math.random() * 100);
    }

    public Date getTime(){
        return time;
    }

    public Long getThread(){
        return thread;
    }
}
