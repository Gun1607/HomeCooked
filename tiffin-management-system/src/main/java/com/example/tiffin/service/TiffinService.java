package com.example.tiffin.service;

import com.example.tiffin.model.Housewife;
import com.example.tiffin.repository.HousewifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TiffinService {

    @Autowired
    private HousewifeRepository housewifeRepository;

    public List<Housewife> getAllTiffins() {
        return housewifeRepository.findAll();
    }

    public List<Housewife> getTiffinsByLocation(String location) {
        return housewifeRepository.findAll()
                .stream()
                .filter(h -> h.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public Housewife getTiffinById(Long id) {
        return housewifeRepository.findById(id).orElse(null);
    }
}
