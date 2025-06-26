package com.example.tiffin.service;

import com.example.tiffin.model.Bachelor;
import com.example.tiffin.model.Housewife;
import com.example.tiffin.repository.BachelorRepository;
import com.example.tiffin.repository.HousewifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private BachelorRepository bachelorRepository;

    @Autowired
    private HousewifeRepository housewifeRepository;

    public List<Housewife> findMatchingTiffins(Long bachelorId) {
        Bachelor bachelor = bachelorRepository.findById(bachelorId).orElse(null);
        if (bachelor == null) return java.util.Collections.emptyList();


        String preferredLocation = bachelor.getPreferredLocation();
        return housewifeRepository.findAll()
                .stream()
                .filter(h -> h.getLocation().equalsIgnoreCase(preferredLocation))
                .collect(Collectors.toList());
    }
}
