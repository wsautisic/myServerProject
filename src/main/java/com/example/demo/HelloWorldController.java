package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/getDataForOne")
    public String getDataForOne() {
        JSONObject jo = new JSONObject();
        JSONObject dataJo = new JSONObject();
        dataJo.put("name","sss");
        dataJo.put("age",18)  ;

        jo.put("code", 200);
        jo.put("data", dataJo);

        return jo.toJSONString();

    }
}
