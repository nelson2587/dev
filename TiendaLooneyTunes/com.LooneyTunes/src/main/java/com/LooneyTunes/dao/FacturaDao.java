/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LooneyTunes.dao;


import com.LooneyTunes.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nelson
 */
public interface FacturaDao extends JpaRepository <Factura, Long> { 
    
}
