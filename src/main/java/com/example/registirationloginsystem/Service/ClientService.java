package com.example.registirationloginsystem.Service;

import com.example.registirationloginsystem.dto.request.UserRequestDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;
import com.example.registirationloginsystem.dto.response.UserResponseDto;

public interface UserService {
    ResponseDto save(UserRequestDto userRequestDto);

}
