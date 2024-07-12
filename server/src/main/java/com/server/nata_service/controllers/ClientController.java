package com.server.nata_service.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @GetMapping
    public ResponseEntity<Object> findAll(){
        return ResponseEntity.ok("test security");
    }
}
