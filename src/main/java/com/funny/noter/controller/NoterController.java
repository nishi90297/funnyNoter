package com.funny.noter.controller;

import com.funny.noter.entity.NoterEntity;
import com.funny.noter.service.NoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoterController {

    @Autowired
    private NoterService noterService;

    @PostMapping(value = "/saveData")
    public NoterEntity saveData(@RequestParam(value = "data") String data){
        NoterEntity result = noterService.saveData(data);
        return result;
    }
    @GetMapping(value = "/getData/{id}")
    public String getData(@PathVariable("id") String id){
        NoterEntity result = noterService.getData(id);
        return result.getData();
    }


}
