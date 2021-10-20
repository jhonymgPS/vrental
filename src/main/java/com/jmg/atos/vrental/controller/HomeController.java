/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.atos.vrental.controller;

import com.jmg.atos.vrental.entity.Client;
import com.jmg.atos.vrental.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author JHONY
 */
@Controller
public class HomeController {
    
    @Autowired
    private ClientService clientService;
    
    @GetMapping(value = "/")
    public String home(Model model){
        List<Client> clients = clientService.getAll();
        model.addAttribute("clients", clients);
        model.addAttribute("name", "Jhony");
        return "home";
    }
}
