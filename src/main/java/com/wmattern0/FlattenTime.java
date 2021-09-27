package com.wmattern0;

import java.io.*;

public class FlattenTime{   
    public static void main(String[] args) {
        String filename = "time.ser";
        if (args.length > 0){
            filename = args[0];
        }
        TransientTime time = new TransientTime();
        System.out.println("writing out from FlattenTime: " + time.getTime() + "\n Thread: " + time.getThread());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(time);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}   