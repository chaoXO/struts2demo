package com.example.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class DateParser {
    public static Timestamp utilToSql(Date date){
//        DateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timeStamp = new Timestamp(date.getTime());
        return timeStamp;
    }

    public static Timestamp getTimeNow(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }

}
