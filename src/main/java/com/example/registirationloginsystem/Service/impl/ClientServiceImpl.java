package com.example.registirationloginsystem.Service.impl;

import com.example.registirationloginsystem.Service.UserService;
import com.example.registirationloginsystem.dto.request.UserRequestDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;
import com.example.registirationloginsystem.entity.User;
import com.example.registirationloginsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseDto save(UserRequestDto userRequestDto) {
        User user=userRepository.save(modelMapper.map(userRequestDto,User.class));
        return user!=null ?
                new ResponseDto("User created Successfully!"):
                new ResponseDto("User created Unsuccessfully!");
    }
}
