package org.sang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/personnel")
public class PersonnelController {
    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/emp/hello")
    public String helloEmp() {
        return "hello emp";
    }
}
