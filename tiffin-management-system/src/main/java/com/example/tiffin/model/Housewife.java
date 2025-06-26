package com.example.tiffin.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Housewife extends User {

    private String location;
    private String menu;
    private double pricePerMeal;
    

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}

}
