package com.Centum.Smartvault.controller;

import com.Centum.Smartvault.entity.Admindetails;
import com.Centum.Smartvault.repository.Adminrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class Admincontroller {
    @Autowired
    private Adminrepository adminrepository;
    @PostMapping
    public ResponseEntity<String>saveAdmindetails(@RequestBody List<Admindetails> admindetailsList){

        // admindetails.saveAll(admindetails);
        return ResponseEntity.ok("admindetails saved");


    }
}
