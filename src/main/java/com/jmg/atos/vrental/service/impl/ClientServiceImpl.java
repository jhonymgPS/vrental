/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.atos.vrental.service.impl;

import com.jmg.atos.vrental.DAO.ClientRepository;
import com.jmg.atos.vrental.DTO.ClientDTO;
import com.jmg.atos.vrental.entity.Client;
import com.jmg.atos.vrental.service.ClientService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JHONY
 */
@Service
public class ClientServiceImpl implements ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }

    @Override
    public void save(ClientDTO clientDTO) {
        Client client = new Client();
        client.setClientId(clientDTO.getClientId());
        client.setFirstname(clientDTO.getFirstname());
        client.setLastname(clientDTO.getLastname());
        client.setPhone(clientDTO.getPhone());
        client.setUsername(clientDTO.getFirstname() + "_" + clientDTO.getLastname());
        clientRepository.save(client);
    }
    
}
