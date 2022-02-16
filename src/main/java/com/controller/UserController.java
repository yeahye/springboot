package com.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.locks.Lock;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author yejunnan
 * @Date 2019/6/10 19:19
 * @VERSION 1.0
 */
@RestController
@RequestMapping("user")
@Api("swaggerDemoController相关的api")
public class UserController {

    private static final Object LOCK = new Object();

    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) throws InterruptedException {
        System.out.println("come in");
        System.out.println("线程名称是" + Thread.currentThread().getName());
        return new User("Andy", 28);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
