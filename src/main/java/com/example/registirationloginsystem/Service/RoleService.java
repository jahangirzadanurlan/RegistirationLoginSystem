package com.example.registirationloginsystem.Service;

import com.example.registirationloginsystem.dto.request.RoleRequestDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;

public interface RoleService {
    ResponseDto save(RoleRequestDto roleRequestDto);
}
