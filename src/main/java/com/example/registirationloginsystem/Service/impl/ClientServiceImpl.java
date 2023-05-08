package com.example.registirationloginsystem.Service.impl;

import com.example.registirationloginsystem.Service.ClientService;
import com.example.registirationloginsystem.dto.request.ClientRequestDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;
import com.example.registirationloginsystem.entity.Client;
import com.example.registirationloginsystem.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseDto save(ClientRequestDto clientRequestDto) {
        Client client = clientRepository.save(modelMapper.map(clientRequestDto, Client.class));
        return client !=null ?
                new ResponseDto("User created Successfully!"):
                new ResponseDto("User created Unsuccessfully!");
    }
    @Override
    public boolean authenticateUser(String username, String password) {
        // Veritabanından kullanıcı adı ve şifre kontrol ediliyor.
        Client client = clientRepository.findByName(username);
        if (client != null && password.equals(client.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

}
