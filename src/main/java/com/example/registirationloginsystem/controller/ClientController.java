package com.example.registirationloginsystem.controller;

import com.example.registirationloginsystem.Service.UserService;
import com.example.registirationloginsystem.dto.request.UserRequestDto;
import com.example.registirationloginsystem.dto.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/registration")
public class UserController {
    private final UserService userService;

    @GetMapping
    public String showRegistrationForm(Model model){
        model.addAttribute("user",new UserRequestDto());
        return "registration";
    }
    @PostMapping
    public String addUser(@ModelAttribute UserRequestDto userRequestDto){
        userService.save(userRequestDto);
        return "redirect:/registration&success";
    }

}
