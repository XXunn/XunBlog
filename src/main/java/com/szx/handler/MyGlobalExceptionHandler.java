package com.szx.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class MyGlobalExceptionHandler {
    // @ModelAttribute 可以在不同的页面传参
//    @ModelAttribute(name = "list")
//    public List<Integer> mydate2() {
//        List<Integer> list = new LinkedList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(4);
//        return list;
//    }
//    @ModelAttribute(name = "md")
//    public Map<String,Object> mydata1() {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("age", 99);
//        map.put("gender", "男");
//        return map;
//    }
//    @ModelAttribute(name = "tt")
//    public Map<String,Object> mydata2() {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("age", 99);
//        map.put("gender", "男");
//        return map;
//    }
}