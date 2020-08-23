package com.aiguigu.java;

import java.util.HashMap;

/**
 * @author liuzhenyu
 * @create 2020/8/23-11:01
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","19");
        map.put("score","99");

        String age = map.get("age");
        String score = map.get("score");
        System.out.println(age);
        System.out.println(score);
        map.remove("age");
    }
}
