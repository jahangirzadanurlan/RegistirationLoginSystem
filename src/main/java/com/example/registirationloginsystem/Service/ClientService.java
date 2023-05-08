package com.example.registirationloginsystem.Service;

import com.example.registirationloginsystem.dto.request.ClientRequestDto;
import com.example.registirationloginsystem.dto.response.ClientResponseDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;

public interface ClientService{
    ResponseDto save(ClientRequestDto clientRequestDto);
    boolean authenticateUser(String name,String password);


}
