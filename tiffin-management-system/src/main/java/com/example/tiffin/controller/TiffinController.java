package com.example.tiffin.controller;

import com.example.tiffin.model.Housewife;
import com.example.tiffin.service.TiffinService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiffins")
public class TiffinController {

    @Autowired
    private TiffinService tiffinService;

    @Operation(summary = "Get all tiffins",
            description = "Returns a list of all housewives providing tiffin services")
    @GetMapping
    public List<Housewife> getAllTiffins() {
        return tiffinService.getAllTiffins();
    }

    @Operation(summary = "Get tiffins by location",
            description = "Returns a list of housewives offering tiffin services in a specific location")
    @GetMapping("/location/{location}")
    public List<Housewife> getTiffinsByLocation(
            @Parameter(description = "Preferred location", required = true)
            @PathVariable("location") String location) {
        return tiffinService.getTiffinsByLocation(location);
    }

    @Operation(summary = "Get tiffin by ID",
            description = "Returns a single housewife's tiffin service by ID")
    @GetMapping("/{id}")
    public Housewife getTiffinById(
            @Parameter(description = "Housewife ID", required = true)
            @PathVariable("id") Long id) {
        return tiffinService.getTiffinById(id);
    }
}
