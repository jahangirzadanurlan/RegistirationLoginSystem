package com.example.registirationloginsystem.repository;

import com.example.registirationloginsystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Client,Long> {

}