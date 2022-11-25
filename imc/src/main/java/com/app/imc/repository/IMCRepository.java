/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.imc.repository;

import com.app.imc.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alexis
 */
public interface IMCRepository extends JpaRepository<Data, Long> {
    
}
