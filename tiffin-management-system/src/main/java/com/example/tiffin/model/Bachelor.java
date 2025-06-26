package com.example.tiffin.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bachelor extends User {

    private String preferredLocation;

}
