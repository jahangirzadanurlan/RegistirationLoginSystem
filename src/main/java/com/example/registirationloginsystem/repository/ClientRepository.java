package com.example.registirationloginsystem.repository;

import com.example.registirationloginsystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findByEmail(String email);
    Client findByName(String name);


}
