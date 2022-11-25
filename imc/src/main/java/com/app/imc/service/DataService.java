/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.imc.service;

import com.app.imc.entity.Data;
import com.app.imc.repository.IMCRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alexis
 */
@Service
@Transactional
public class DataService {
    
    @Autowired
    private IMCRepository repo;

    public List<Data> listAll() {
        return repo.findAll();
    }

    public void save(Data product) {
        repo.save(product);
    }

    public Data get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
    
}
