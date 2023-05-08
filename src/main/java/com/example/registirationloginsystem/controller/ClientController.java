package com.example.registirationloginsystem.controller;

import com.example.registirationloginsystem.Service.ClientService;
import com.example.registirationloginsystem.dto.request.ClientRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/registration")
    public String showRegistrationForm(Model model){
        model.addAttribute("user",new ClientRequestDto());
        return "registration";
    }
    @PostMapping("registration")
    public String addUser(@ModelAttribute ClientRequestDto clientRequestDto, HttpSession session){
        clientService.save(clientRequestDto);
        session.setAttribute("username", clientRequestDto.getName());
        return "redirect:/home";
    }

}
