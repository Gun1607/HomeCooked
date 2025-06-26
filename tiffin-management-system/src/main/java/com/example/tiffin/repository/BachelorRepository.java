package com.example.tiffin.repository;

import com.example.tiffin.model.Bachelor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BachelorRepository extends JpaRepository<Bachelor, Long> {
}
