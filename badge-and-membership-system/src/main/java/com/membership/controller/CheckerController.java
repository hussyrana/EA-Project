package com.membership.controller;

import com.membership.domain.Checker;
import com.membership.domain.Member;
import com.membership.service.CheckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/checkers")
public class CheckerController {

    @Autowired
    CheckerService checkerService;

//    @GetMapping
//    public Member authenticateChecker(@RequestBody Checker checker){
//        return checkerService.authenticateChecker(checker.getUserName(), checker.getPassword());
//    }
}
