package com.example.demo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UuidRepo extends JpaRepository<UUIDClass, UUID>{

}
