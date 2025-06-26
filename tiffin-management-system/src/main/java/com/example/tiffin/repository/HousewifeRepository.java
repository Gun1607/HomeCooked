package com.example.tiffin.repository;

import com.example.tiffin.model.Housewife;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousewifeRepository extends JpaRepository<Housewife, Long> {
}
