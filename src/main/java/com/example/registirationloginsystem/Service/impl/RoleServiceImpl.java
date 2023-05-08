package com.example.registirationloginsystem.Service.impl;

import com.example.registirationloginsystem.Service.RoleService;
import com.example.registirationloginsystem.dto.request.RoleRequestDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;
import com.example.registirationloginsystem.entity.Role;
import com.example.registirationloginsystem.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseDto save(RoleRequestDto roleRequestDto) {
        Role role=roleRepository.save(modelMapper.map(roleRequestDto, Role.class));
        return role !=null ?
                new ResponseDto("Role created Successfully!"):
                new ResponseDto("Role created Unsuccessfully!");
    }
}
