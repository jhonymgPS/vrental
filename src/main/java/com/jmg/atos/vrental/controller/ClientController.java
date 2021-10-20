/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.atos.vrental.controller;

import com.jmg.atos.vrental.DTO.ClientDTO;
import com.jmg.atos.vrental.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JHONY
 */
@Controller
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired
    private ClientService clientService;
    
    
    @GetMapping( value = "/profile" )
    public String profile(Model model){
        model.addAttribute("client", new ClientDTO());
        return "clientprofile";
    }
    
    @PostMapping(value = "save")
    public ModelAndView save(ClientDTO client, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return new ModelAndView("clientprofile");
        }
        clientService.save(client);
        return new ModelAndView("redirect:/");
    }
    
}
