package com.example.securityApp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @RequestMapping("/welcome")
    public String welcome(HttpServletRequest request) {

        return "Hello World "+request.getRequestedSessionId();
    }

}
