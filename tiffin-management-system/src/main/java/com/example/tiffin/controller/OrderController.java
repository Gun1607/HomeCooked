package com.example.tiffin.controller;

import com.example.tiffin.model.Housewife;
import com.example.tiffin.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Operation(
            summary = "Get matching tiffins for a bachelor",
            description = "Given a bachelor’s ID, returns a list of housewives whose tiffin offerings match his preferences"
    )
    @GetMapping("/match/{bachelorId}")
    public List<Housewife> getMatchingTiffins(
            @Parameter(description = "ID of the bachelor", required = true)
            @PathVariable("bachelorId") Long bachelorId
    ) {
        return orderService.findMatchingTiffins(bachelorId);
    }
}
