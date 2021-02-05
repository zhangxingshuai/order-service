package com.spider;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {
    static RestTemplate restTemplate = new RestTemplate();
    static String url = "http://localhost:8905/yhq/getPendingStudents";

    public static void main(String[] args) {


       // Object obj = restTemplate.getForObject("http://localhost:8905/yhq/getPendingStudents?startTime=2020-10-29 12:00:00&endTime=2020-10-30", Object.class);
        //System.out.println(obj.toString());
        get();

    }

    public static void get(){
        //1.设置请求头
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=utf-8");
        headers.setContentType(type);

        //2.设置请求参数
        HashMap<String, Object> map = new HashMap<>();
        map.put("startTime", "2021-01-25");
        map.put("endTime", "2021-01-26");
        HttpEntity<Object> entity = new HttpEntity<>(map);


        Object obj = restTemplate.getForObject(url, Object.class);
        Map<String, List<Map<String, Object>>> data = (Map<String, List<Map<String, Object>>>)obj;
        if (data != null) {
            List<Map<String, Object>> list = (List<Map<String, Object>>) data.get("data");
            list.forEach(item -> {
                System.out.println(item.get("flow_account"));
            });
        }
    }
}
