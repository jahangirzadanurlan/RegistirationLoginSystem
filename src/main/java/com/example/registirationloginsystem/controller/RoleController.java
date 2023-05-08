package com.example.registirationloginsystem.controller;

import com.example.registirationloginsystem.Service.RoleService;
import com.example.registirationloginsystem.dto.request.RoleRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;
    @PostMapping("/roles")
    public String addRole(@RequestBody RoleRequestDto roleRequestDto){
        roleService.save(roleRequestDto);
        return "redirect:/login";
    }
}
