package com.study.utill;

import lombok.Data;

@Data
public class ResponseUtil {

    private int code;
    private String msg;
    private Object data;

    public static  ResponseUtil success(String msg,Object data){
        ResponseUtil responseUtil=new ResponseUtil();
        responseUtil.setCode(200);
        responseUtil.setMsg(msg);
        responseUtil.setData(data);
        return responseUtil;
    }

    public static  ResponseUtil successMsg(String msg){
        ResponseUtil responseUtil=new ResponseUtil();
        responseUtil.setCode(200);
        responseUtil.setMsg(msg);
        return responseUtil;
    }

    public static  ResponseUtil error(String msg){
        ResponseUtil responseUtil=new ResponseUtil();
        responseUtil.setCode(400);
        responseUtil.setMsg(msg);
        return responseUtil;
    }

}
