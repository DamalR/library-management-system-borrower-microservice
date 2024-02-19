package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Borrower;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrower")
@RequiredArgsConstructor
public class BorrowerController{

    final BorrowerService service;

    @PostMapping("/add")
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }
}
