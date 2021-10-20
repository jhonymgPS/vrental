/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.atos.vrental.DAO;

import com.jmg.atos.vrental.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JHONY
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
