package com.example.hello.controller;


import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) //get http://localhost8080:/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:8080/api/get/pathvariable/{name}
    @GetMapping("/path-variable/{id}") //변수명 통일해야함 일치시킬수 없을땐 변수명 지정해야함
    public  String pathVariable(@PathVariable(name = "id") String pathname){

        System.out.println("PathVariable : " + pathname);

        return pathname;
    }

    //http://localhost:80 80/api/get/qeury-param?user=steve&email=dhgus44@naver.com&age=27

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();

    }

    // ?key=value&key2=value2
    // search?q = inteliJ
    // &oq = inteliJ
    // &aqs = chrome..69i57.1651j0j15
    // &sourceid = chrome
    // &ie = UTF-8

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}

