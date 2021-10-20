/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.atos.vrental.service;

import com.jmg.atos.vrental.DTO.ClientDTO;
import com.jmg.atos.vrental.entity.Client;
import java.util.List;

/**
 *
 * @author JHONY
 */
public interface ClientService {
    
    List<Client> getAll();
    
    void save(ClientDTO clientDTO);
}
