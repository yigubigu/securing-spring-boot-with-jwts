package com.example;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

	// 路由映射到/users
	@RequestMapping(value = "/users", produces="application/json;charset=UTF-8")
	public String usersList() {

        ArrayList<String> users =  new ArrayList<String>(){{
            add("freewolf");
            add("tom");
            add("jerry");
        }};

		return JSONResult.fillResultString(0, "", users);
	}

    @RequestMapping(value = "/hello", produces="application/json;charset=UTF-8")
    public String hello() {
    	System.out.println("UserController.hello()...");
        ArrayList<String> users =  new ArrayList<String>(){{ add("hello"); }};
        return JSONResult.fillResultString(0, "", users);
    }

    @RequestMapping(value = "/world", produces="application/json;charset=UTF-8")
    public String world() {
    	System.out.println("UserController.world()...");
        ArrayList<String> users =  new ArrayList<String>(){{ add("world"); }};
        return JSONResult.fillResultString(0, "", users);
    }
}