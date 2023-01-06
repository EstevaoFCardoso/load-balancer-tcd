package com.server2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/get")
    public ResponseEntity<Object> testeGet(){
        return ResponseEntity.status(HttpStatus.OK).body("Server 2: Req GET");
    }

    @PostMapping("/post")
    public ResponseEntity<Object> testePost(@RequestBody String message){
        return ResponseEntity.status(HttpStatus.OK).body("Server 2: Req POST");
    }

}
