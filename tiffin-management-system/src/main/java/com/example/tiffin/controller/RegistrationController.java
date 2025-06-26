package com.example.tiffin.controller;

import com.example.tiffin.model.Bachelor;
import com.example.tiffin.model.Housewife;
import com.example.tiffin.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/housewife")
    public Housewife registerHousewife(@RequestBody Housewife housewife) {
        return registrationService.registerHousewife(housewife);
    }

    @PostMapping("/bachelor")
    public Bachelor registerBachelor(@RequestBody Bachelor bachelor) {
        return registrationService.registerBachelor(bachelor);
    }
}
