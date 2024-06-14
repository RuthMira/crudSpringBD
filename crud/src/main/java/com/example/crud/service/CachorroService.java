package com.example.crud.service;

import com.example.crud.model.Cachorro;
import com.example.crud.repository.CachorroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CachorroService {
    @Autowired
    private CachorroRepository repository;

    public List<Cachorro> findAll() {
        return repository.findAll();
    }

    public Cachorro save(Cachorro cachorro) {
        return repository.save(cachorro);
    }

    public Cachorro findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
