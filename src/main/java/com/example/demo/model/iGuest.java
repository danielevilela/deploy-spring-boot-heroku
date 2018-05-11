package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Guest;

public interface iGuest extends JpaRepository<Guest, Long> {

}
