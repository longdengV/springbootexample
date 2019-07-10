package com.example.bnaio;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BnaioApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test1(){

        String str = "1";
        String[] split = str.split(",");

        System.out.println(split.toString());
    }

    @Test
    // 处理json数据格式转换
    public void test2(){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        String str = JSONObject.toJSONString(list);
        System.out.println(str);
    }

    @Test
    public void jsonStr2Obj(){
        String str = "[1,2,3]";
        List<Integer> list = (List<Integer>) JSONObject.parse(str);
        System.out.println(list.size());
    }

    @Test
    public void jsonStr2Obj2(){
        String str = "[1,2,3]";
        Set<Integer> list = (Set<Integer>) JSONObject.parse(str);
        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);
    }

    @Test
    public void exceptionJsonStr2Obj(){
        String str = "[]";
        List<Integer> list = (List<Integer>) JSONObject.parse(str);
        System.out.println(list.size());
    }


}
