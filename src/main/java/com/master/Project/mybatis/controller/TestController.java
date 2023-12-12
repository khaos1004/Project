package com.master.Project.mybatis.controller;

import com.master.Project.mybatis.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object test() {
        return "Hello World!";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return testService.getUserList();
    }
}
