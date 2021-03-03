package com.study.utill;

import com.study.entity.UserVo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Integer integer = getUUID.nextItemNo();
        System.out.println(integer);
        UserVo userVo=new UserVo();
                userVo.setAccount("123");
                userVo.setPassword("345");
        List<UserVo> voList=new ArrayList<>();
        voList.add(userVo);
        System.out.println(voList);
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        int [] a={4,5};
        System.out.println();

    }
}
