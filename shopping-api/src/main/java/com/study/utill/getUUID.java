package com.study.utill;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public   class   getUUID {
    public static Integer nextItemNo(){
        Date date = new Date();
       SimpleDateFormat sdformat = new SimpleDateFormat("HHmmssSSS");
        String id = sdformat.format(date);
        Integer integer = Integer.parseInt(id);
        return integer;
    }
}
