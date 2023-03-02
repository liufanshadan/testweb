package com.example.testweb.test;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LfController {
    @RequestMapping("/demo1")
    public Person  test1(String name,int age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }

    @RequestMapping("/demo2")
    public String  demo2(String str){
        return str;
    }

    @PostMapping("/paramtest")
    public Person  test2(@RequestBody Person person){

        return person;
    }
    @PostMapping("/jisuan1")
    public  int  jisuan1(@RequestBody  Map<String,Integer> map){
        int num1 = map.get("num1");
        int num2 = map.get("num2");
        int ret = num1 + num2;
        System.out.println("jisuan1"+ret);
        return ret;
    }
    @PostMapping("/jisuan2")
    public  int  jisuan2(@RequestBody Map <String,Integer> map){
        int num = map.get("num");
        System.out.println("jisuan2:"+2*num);
        return 2*num;
    }
}
