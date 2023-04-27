package com.example.HibernateProject.controller;

import com.example.HibernateProject.service.HibernateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HibernateController {
//     private final HibernateService hibernateService;
//
//    public HibernateController(HibernateService hibernateService) {
//        this.hibernateService = hibernateService;
//    }
//
//
//    @GetMapping("ID/{number}")
//    public ResponseEntity<?> get(@PathVariable int number) {
//        try {
//            return ResponseEntity.ok(hibernateService.getOne(number));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//    }
}
