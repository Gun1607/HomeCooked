package com.example.tiffin.service;

import com.example.tiffin.model.Bachelor;
import com.example.tiffin.model.Housewife;
import com.example.tiffin.repository.BachelorRepository;
import com.example.tiffin.repository.HousewifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private HousewifeRepository housewifeRepository;

    @Autowired
    private BachelorRepository bachelorRepository;

    public Housewife registerHousewife(Housewife housewife) {
        return housewifeRepository.save(housewife);
    }

    public Bachelor registerBachelor(Bachelor bachelor) {
        return bachelorRepository.save(bachelor);
    }
}
