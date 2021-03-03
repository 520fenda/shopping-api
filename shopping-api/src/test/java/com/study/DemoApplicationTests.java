package com.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	    int [] arr={1,20};
        HashMap<String,Object> map=new HashMap<>();
        map.put("code", 200);
        map.put("name", "zhangsan");
        map.put("sex", "man");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry);
                    entry.getKey();
                    entry.getValue();
        }
        for (String s : map.keySet()) {
            System.out.println(s);
            System.out.println(map.get(s));
        }



	}

}
